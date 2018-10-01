package com.esocial.dto;

public class PostDTO {

    private int postId;
    private String description;
    private String date;
    private String time;

    public PostDTO() {
    }

    public PostDTO(int postId, String description, String date, String time) {
        this.postId = postId;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "PostDTO{" +
                "postId=" + postId +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
