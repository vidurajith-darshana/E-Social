package com.esocial.dto;

public class CommentDTO {

    private int commentId;
    private int userId;
    private int postId;
    private String comment;
    private boolean isReply;
    private int relatedCommentId;
    private String date;
    private String time;

    public CommentDTO() {
    }

    public CommentDTO(int commentId, int userId, int postId, String comment, boolean isReply, int relatedCommentId, String date, String time) {
        this.commentId = commentId;
        this.userId = userId;
        this.postId = postId;
        this.comment = comment;
        this.isReply = isReply;
        this.relatedCommentId = relatedCommentId;
        this.date = date;
        this.time = time;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isReply() {
        return isReply;
    }

    public void setReply(boolean reply) {
        isReply = reply;
    }

    public int getRelatedCommentId() {
        return relatedCommentId;
    }

    public void setRelatedCommentId(int relatedCommentId) {
        this.relatedCommentId = relatedCommentId;
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
        return "CommentDTO{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", postId=" + postId +
                ", comment='" + comment + '\'' +
                ", isReply=" + isReply +
                ", relatedCommentId=" + relatedCommentId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
