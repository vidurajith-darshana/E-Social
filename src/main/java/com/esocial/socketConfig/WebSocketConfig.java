package com.esocial.socketConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Autowired
    private Users users;

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic","/queue");
        config.setApplicationDestinationPrefixes("/esocial");
        config.setUserDestinationPrefix("/friend");
    }
 
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
         registry.addEndpoint("/chat");
         registry.addEndpoint("/chat").setHandshakeHandler(new CustomHandshakeHandler()).withSockJS();
    }

    class CustomHandshakeHandler extends DefaultHandshakeHandler {
        // Custom class for storing principal
        @Override
        protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler, Map<String, Object> attributes) {
            // Generate principal with UUID as name
            String session=UUID.randomUUID().toString();
            return new StompPrincipal(session);
        }
    }
}