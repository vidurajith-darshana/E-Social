package com.esocial.dto;

public class GroupChatDTO {

    private int groupChatId;
    private int userId;
    private int chatId;
    private String groupName;

    public GroupChatDTO() {
    }

    public int getGroupChatId() {
        return groupChatId;
    }

    public void setGroupChatId(int groupChatId) {
        this.groupChatId = groupChatId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "GroupChatDTO{" +
                "groupChatId=" + groupChatId +
                ", userId=" + userId +
                ", chatId=" + chatId +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
