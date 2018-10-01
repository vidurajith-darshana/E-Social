package com.esocial.dto;

public class ChatNotificationDTO {

    private int chatNotifyId;
    private int userId;
    private int chatId;
    private String notification;
    private boolean isSee;

    public ChatNotificationDTO() {
    }

    public ChatNotificationDTO(int chatNotifyId, int userId, int chatId, String notification, boolean isSee) {
        this.chatNotifyId = chatNotifyId;
        this.userId = userId;
        this.chatId = chatId;
        this.notification = notification;
        this.isSee = isSee;
    }

    public int getChatNotifyId() {
        return chatNotifyId;
    }

    public void setChatNotifyId(int chatNotifyId) {
        this.chatNotifyId = chatNotifyId;
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
        return "ChatNotificationDTO{" +
                "chatNotifyId=" + chatNotifyId +
                ", userId=" + userId +
                ", chatId=" + chatId +
                ", notification='" + notification + '\'' +
                ", isSee=" + isSee +
                '}';
    }
}
