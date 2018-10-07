package com.esocial.entity;

import javax.persistence.*;

@Entity
public class GroupChat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupChatId",nullable = false)
    private int groupChatId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatId",referencedColumnName = "chatId")
    private Chat chat;

    private String groupName;

    public GroupChat() {
    }

    public GroupChat(User user, Chat chat, String groupName) {
        this.user = user;
        this.chat = chat;
        this.groupName = groupName;
    }

    public GroupChat(int groupChatId,User user, Chat chat, String groupName) {
        this.groupChatId=groupChatId;
        this.user = user;
        this.chat = chat;
        this.groupName = groupName;
    }

    public int getGroupChatId() {
        return groupChatId;
    }

    public void setGroupChatId(int groupChatId) {
        this.groupChatId = groupChatId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "GroupChat{" +
                "groupChatId=" + groupChatId +
                ", user=" + user +
                ", chat=" + chat +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
