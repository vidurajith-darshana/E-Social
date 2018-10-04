package com.esocial.dto;

public class UserRequestDTO {

    private int userRequestId;
    private UserDTO userDTO;
    private RequestDTO requestDTO;
    private int accept;

    public UserRequestDTO() {
    }

    public UserRequestDTO(int userRequestId, UserDTO userDTO, RequestDTO requestDTO, int accept) {
        this.userRequestId = userRequestId;
        this.userDTO = userDTO;
        this.requestDTO = requestDTO;
        this.accept = accept;
    }

    public int getUserRequestId() {
        return userRequestId;
    }

    public void setUserRequestId(int userRequestId) {
        this.userRequestId = userRequestId;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public RequestDTO getRequestDTO() {
        return requestDTO;
    }

    public void setRequestDTO(RequestDTO requestDTO) {
        this.requestDTO = requestDTO;
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
                ", userDTO=" + userDTO +
                ", requestDTO=" + requestDTO +
                ", accept=" + accept +
                '}';
    }
}
