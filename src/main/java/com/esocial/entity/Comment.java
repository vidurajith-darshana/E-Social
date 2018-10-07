package com.esocial.entity;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentId",nullable = false)
    private int commentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId",referencedColumnName = "postId")
    private Post post;

    private String comment;
    private boolean isReply;
    private int relatedCommentId;
    private String date;
    private String time;

    public Comment() {
    }

    public Comment(User user, Post post, String comment, boolean isReply, int relatedCommentId, String date, String time) {
        this.user = user;
        this.post = post;
        this.comment = comment;
        this.isReply = isReply;
        this.relatedCommentId = relatedCommentId;
        this.date = date;
        this.time = time;
    }

    public Comment(int commentId,User user, Post post, String comment, boolean isReply, int relatedCommentId, String date, String time) {
        this.commentId=commentId;
        this.user = user;
        this.post = post;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
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
        return "Comment{" +
                "commentId=" + commentId +
                ", user=" + user +
                ", post=" + post +
                ", comment='" + comment + '\'' +
                ", isReply=" + isReply +
                ", relatedCommentId=" + relatedCommentId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
