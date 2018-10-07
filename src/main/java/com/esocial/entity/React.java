package com.esocial.entity;

import javax.persistence.*;

@Entity
public class React {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int reactId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId",referencedColumnName = "postId")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commentId",referencedColumnName = "commentId")
    private Comment comment;

    private int react;

    public React() {
    }

    public React(User user, Post post, Comment comment, int react) {
        this.user = user;
        this.post = post;
        this.comment = comment;
        this.react = react;
    }

    public React(int reactId, User user, Post post, Comment comment, int react) {
        this.reactId =reactId;
        this.user = user;
        this.post = post;
        this.comment = comment;
        this.react = react;
    }

    public int getReactId() {
        return reactId;
    }

    public void setReactId(int reactId) {
        this.reactId = reactId;
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

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public int getReact() {
        return react;
    }

    public void setReact(int react) {
        this.react = react;
    }

    @Override
    public String toString() {
        return "React{" +
                "reactId=" + reactId +
                ", user=" + user +
                ", post=" + post +
                ", comment=" + comment +
                ", react=" + react +
                '}';
    }
}
