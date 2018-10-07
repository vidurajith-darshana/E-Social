package com.esocial.entity;

import javax.persistence.*;

@Entity
public class ChatNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int chatNotifyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User userDTO;

    @ManyToOne
    @JoinColumn(name = "chatId",referencedColumnName = "chatId")
    private Chat chatDTO;

    private String notification;
    private boolean isSee;

    public ChatNotification() {
    }

    public ChatNotification(User userDTO, Chat chatDTO, String notification, boolean isSee) {
        this.userDTO = userDTO;
        this.chatDTO = chatDTO;
        this.notification = notification;
        this.isSee = isSee;
    }

    public ChatNotification(int chatNotifyId,User userDTO, Chat chatDTO, String notification, boolean isSee) {
        this.chatNotifyId=chatNotifyId;
        this.userDTO = userDTO;
        this.chatDTO = chatDTO;
        this.notification = notification;
        this.isSee = isSee;
    }

    public int getChatNotifyId() {
        return chatNotifyId;
    }

    public void setChatNotifyId(int chatNotifyId) {
        this.chatNotifyId = chatNotifyId;
    }

    public User getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(User userDTO) {
        this.userDTO = userDTO;
    }

    public Chat getChatDTO() {
        return chatDTO;
    }

    public void setChatDTO(Chat chatDTO) {
        this.chatDTO = chatDTO;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public boolean isSee() {
        return isSee;
    }

    public void setSee(boolean see) {
        isSee = see;
    }

    @Override
    public String toString() {
        return "ChatNotification{" +
                "chatNotifyId=" + chatNotifyId +
                ", userDTO=" + userDTO +
                ", chatDTO=" + chatDTO +
                ", notification='" + notification + '\'' +
                ", isSee=" + isSee +
                '}';
    }
}
