package com.esocial.entity;

import javax.persistence.*;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chatId",nullable = false)
    private int chatId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

    private int receiverId;
    private String message;
    private String date;
    private String time;

    public Chat() {
    }

    public Chat(User user, int receiverId, String message, String date, String time) {
        this.user = user;
        this.receiverId = receiverId;
        this.message = message;
        this.date = date;
        this.time = time;
    }

    public Chat(int chatId,User user, int receiverId, String message, String date, String time) {
        this.chatId=chatId;
        this.user = user;
        this.receiverId = receiverId;
        this.message = message;
        this.date = date;
        this.time = time;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatId=" + chatId +
                ", user=" + user +
                ", receiverId=" + receiverId +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
