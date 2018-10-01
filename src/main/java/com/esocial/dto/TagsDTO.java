package com.esocial.dto;

public class TagsDTO {

    private int tagId;
    private int userId;
    private int postId;

    public TagsDTO() {
    }

    public TagsDTO(int tagId, int userId, int postId) {
        this.tagId = tagId;
        this.userId = userId;
        this.postId = postId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "TagsDTO{" +
                "tagId=" + tagId +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
