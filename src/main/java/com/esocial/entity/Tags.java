package com.esocial.entity;

import javax.persistence.*;

@Entity
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int tagId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "postId",referencedColumnName = "postId")
    private Post post;

    public Tags() {
    }

    public Tags(User user, Post post) {
        this.user = user;
        this.post = post;
    }

    public Tags(int tagId,User user, Post post) {
        this.tagId=tagId;
        this.user = user;
        this.post = post;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
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

    @Override
    public String toString() {
        return "Tags{" +
                "tagId=" + tagId +
                ", user=" + user +
                ", post=" + post +
                '}';
    }
}
