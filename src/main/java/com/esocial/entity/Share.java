package com.esocial.entity;

import javax.persistence.*;

@Entity
public class Share {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int shareId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId",referencedColumnName = "postId")
    private Post post;

    private String topic;
    private String date;
    private String time;
    private boolean isPublic;
    private boolean isPrivate;
    private boolean isFriends;
    private boolean isSpecificFriends;
    private int specificUserId;

    public Share() {
    }

    public Share(User user, Post post, String topic, String date, String time, boolean isPublic, boolean isPrivate, boolean isFriends, boolean isSpecificFriends, int specificUserId) {
        this.user = user;
        this.post = post;
        this.topic = topic;
        this.date = date;
        this.time = time;
        this.isPublic = isPublic;
        this.isPrivate = isPrivate;
        this.isFriends = isFriends;
        this.isSpecificFriends = isSpecificFriends;
        this.specificUserId = specificUserId;
    }

    public Share(int shareId,User user, Post post, String topic, String date, String time, boolean isPublic, boolean isPrivate, boolean isFriends, boolean isSpecificFriends, int specificUserId) {
        this.shareId=shareId;
        this.user = user;
        this.post = post;
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
        return "Share{" +
                "shareId=" + shareId +
                ", user=" + user +
                ", post=" + post +
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
