package com.esocial.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chatId",nullable = false)
    private int chatId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

    private Set<Integer> receiverIds;
    private String message;
    private String date;
    private String time;

    public Chat() {
    }

    public Chat(User user, Set<Integer> receiverIds, String message, String date, String time) {
        this.user = user;
        this.receiverIds = receiverIds;
        this.message = message;
        this.date = date;
        this.time = time;
    }

    public Chat(int chatId,User user, Set<Integer> receiverIds, String message, String date, String time) {
        this.chatId=chatId;
        this.user = user;
        this.receiverIds = receiverIds;
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

    public Set<Integer> getReceiverIds() {
        return receiverIds;
    }

    public void setReceiverIds(Set<Integer> receiverIds) {
        this.receiverIds = receiverIds;
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
                ", receiverIds=" + receiverIds +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
