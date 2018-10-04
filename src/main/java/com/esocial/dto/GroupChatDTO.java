package com.esocial.dto;

public class GroupChatDTO {

    private int groupChatId;
    private UserDTO userDTO;
    private ChatDTO chatDTO;
    private String groupName;

    public GroupChatDTO() {
    }

    public GroupChatDTO(int groupChatId, UserDTO userDTO, ChatDTO chatDTO, String groupName) {
        this.groupChatId = groupChatId;
        this.userDTO = userDTO;
        this.chatDTO = chatDTO;
        this.groupName = groupName;
    }

    public int getGroupChatId() {
        return groupChatId;
    }

    public void setGroupChatId(int groupChatId) {
        this.groupChatId = groupChatId;
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
                ", userDTO=" + userDTO +
                ", chatDTO=" + chatDTO +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
