package com.esocial.dto;

public class CommentDTO {

    private int commentId;
    private UserDTO userDTO;
    private PostDTO postDTO;
    private String comment;
    private boolean isReply;
    private int relatedCommentId;
    private String date;
    private String time;

    public CommentDTO() {
    }

    public CommentDTO(int commentId, UserDTO userDTO, PostDTO postDTO, String comment, boolean isReply, int relatedCommentId, String date, String time) {
        this.commentId = commentId;
        this.userDTO = userDTO;
        this.postDTO = postDTO;
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
                ", userDTO=" + userDTO +
                ", postDTO=" + postDTO +
                ", comment='" + comment + '\'' +
                ", isReply=" + isReply +
                ", relatedCommentId=" + relatedCommentId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
