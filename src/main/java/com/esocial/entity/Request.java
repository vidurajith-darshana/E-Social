package com.esocial.entity;

import javax.persistence.*;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "requestId",nullable = false)
    private int requestId;

    private int mutualFriends;
    private String date;
    private String time;

    public Request() {
    }

    public Request(int mutualFriends, String date, String time) {
        this.mutualFriends = mutualFriends;
        this.date = date;
        this.time = time;
    }

    public Request(int requestId,int mutualFriends, String date, String time) {
        this.requestId=requestId;
        this.mutualFriends = mutualFriends;
        this.date = date;
        this.time = time;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getMutualFriends() {
        return mutualFriends;
    }

    public void setMutualFriends(int mutualFriends) {
        this.mutualFriends = mutualFriends;
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
        return "Request{" +
                "requestId=" + requestId +
                ", mutualFriends=" + mutualFriends +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
