package com.esocial.dto;

public class UserRequestDTO {

    private int userRequestId;
    private int userId;
    private int requestId;
    private int accept;

    public UserRequestDTO() {
    }

    public UserRequestDTO(int userRequestId, int userId, int requestId, int accept) {
        this.userRequestId = userRequestId;
        this.userId = userId;
        this.requestId = requestId;
        this.accept = accept;
    }

    public int getUserRequestId() {
        return userRequestId;
    }

    public void setUserRequestId(int userRequestId) {
        this.userRequestId = userRequestId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getAccept() {
        return accept;
    }

    public void setAccept(int accept) {
        this.accept = accept;
    }

    @Override
    public String toString() {
        return "UserRequestDTO{" +
                "userRequestId=" + userRequestId +
                ", userId=" + userId +
                ", requestId=" + requestId +
                ", accept=" + accept +
                '}';
    }
}
