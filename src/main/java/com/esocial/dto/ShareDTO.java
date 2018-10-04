package com.esocial.dto;

public class ShareDTO {

    private int shareId;
    private UserDTO userDTO;
    private PostDTO postDTO;
    private String topic;
    private String date;
    private String time;
    private boolean isPublic;
    private boolean isPrivate;
    private boolean isFriends;
    private boolean isSpecificFriends;
    private int specificUserId;

    public ShareDTO() {
    }

    public ShareDTO(int shareId, UserDTO userDTO, PostDTO postDTO, String topic, String date, String time, boolean isPublic, boolean isPrivate, boolean isFriends, boolean isSpecificFriends, int specificUserId) {
        this.shareId = shareId;
        this.userDTO = userDTO;
        this.postDTO = postDTO;
        this.topic = topic;
        this.date = date;
        this.time = time;
        this.isPublic = isPublic;
        this.isPrivate = isPrivate;
        this.isFriends = isFriends;
        this.isSpecificFriends = isSpecificFriends;
        this.specificUserId = specificUserId;
    }

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public PostDTO getPostDTO() {
        return postDTO;
    }

    public void setPostDTO(PostDTO postDTO) {
        this.postDTO = postDTO;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public boolean isFriends() {
        return isFriends;
    }

    public void setFriends(boolean friends) {
        isFriends = friends;
    }

    public boolean isSpecificFriends() {
        return isSpecificFriends;
    }

    public void setSpecificFriends(boolean specificFriends) {
        isSpecificFriends = specificFriends;
    }

    public int getSpecificUserId() {
        return specificUserId;
    }

    public void setSpecificUserId(int specificUserId) {
        this.specificUserId = specificUserId;
    }

    @Override
    public String toString() {
        return "ShareDTO{" +
                "shareId=" + shareId +
                ", userDTO=" + userDTO +
                ", postDTO=" + postDTO +
                ", topic='" + topic + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", isPublic=" + isPublic +
                ", isPrivate=" + isPrivate +
                ", isFriends=" + isFriends +
                ", isSpecificFriends=" + isSpecificFriends +
                ", specificUserId=" + specificUserId +
                '}';
    }
}
