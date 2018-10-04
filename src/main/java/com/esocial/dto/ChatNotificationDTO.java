package com.esocial.dto;

public class ChatNotificationDTO {

    private int chatNotifyId;
    private UserDTO userDTO;
    private ChatDTO chatDTO;
    private String notification;
    private boolean isSee;

    public ChatNotificationDTO() {
    }

    public ChatNotificationDTO(int chatNotifyId, UserDTO userDTO, ChatDTO chatDTO, String notification, boolean isSee) {
        this.chatNotifyId = chatNotifyId;
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

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public ChatDTO getChatDTO() {
        return chatDTO;
    }

    public void setChatDTO(ChatDTO chatDTO) {
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
        return "ChatNotificationDTO{" +
                "chatNotifyId=" + chatNotifyId +
                ", userDTO=" + userDTO +
                ", chatDTO=" + chatDTO +
                ", notification='" + notification + '\'' +
                ", isSee=" + isSee +
                '}';
    }
}
