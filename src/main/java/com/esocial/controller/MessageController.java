package com.esocial.controller;

import com.esocial.dto.ChatDTO;
import com.esocial.socketConfig.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.messaging.SessionConnectedEvent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;


@Controller
public class MessageController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Autowired
    private Users users;


//    send message to chat sesssions
    @MessageMapping("/chatSessions")
    public void sendToFriends(SimpMessageHeaderAccessor sha, ChatDTO chatDTO) throws Exception {

//        time calculate
        String time = new SimpleDateFormat("HH:mm").format(new Date());

//        date calculate
        Date d=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String date=df.format(d);

        chatDTO.setTime(time);
        chatDTO.setDate(date);

        chatDTO.getReceiverIds().forEach(userId->{
            users.getUserSessions().forEach((id,userSession)->{
                if((int)userId==id){
                    if(userSession.size()>0){
                        for (String session : userSession) {
                            simpMessagingTemplate.convertAndSendToUser(session, "/queue/reply", chatDTO);
                        }
                    }

                }
            });

        });
    }

    @EventListener
    void handleSessionConnectedEvent(SessionConnectedEvent event) {
        // Get Accessor
        StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());

    }
}
