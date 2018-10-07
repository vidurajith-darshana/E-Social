package com.esocial.entity;

import javax.persistence.*;

@Entity
public class UserRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int userRequestId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requestId",referencedColumnName = "requestId")
    private Request request;

    private int accept;

    public UserRequest() {
    }

    public UserRequest(User user, Request request, int accept) {
        this.user = user;
        this.request = request;
        this.accept = accept;
    }

    public UserRequest(int userRequestId,User user, Request request, int accept) {
        this.userRequestId=userRequestId;
        this.user = user;
        this.request = request;
        this.accept = accept;
    }

    public int getUserRequestId() {
        return userRequestId;
    }

    public void setUserRequestId(int userRequestId) {
        this.userRequestId = userRequestId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public int getAccept() {
        return accept;
    }

    public void setAccept(int accept) {
        this.accept = accept;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "userRequestId=" + userRequestId +
                ", user=" + user +
                ", request=" + request +
                ", accept=" + accept +
                '}';
    }
}
