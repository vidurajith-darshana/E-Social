package com.esocial.dto;

public class ChatDTO {

    private int chatId;
    private int userId;
    private int receiverId;
    private String message;
    private String date;
    private String time;

    public ChatDTO() {
    }

    public ChatDTO(int chatId, int userId, int receiverId, String message, String date, String time) {
        this.chatId = chatId;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        return "ChatDTO{" +
                "chatId=" + chatId +
                ", userId=" + userId +
                ", receiverId=" + receiverId +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
