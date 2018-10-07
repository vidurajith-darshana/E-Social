package com.esocial.dto;

public class ReactDTO {

    private int reactId;
    private UserDTO userDTO;
    private PostDTO postDTO;
    private CommentDTO commentDTO;
    private int react;

    public ReactDTO() {
    }

    public ReactDTO(int reactId, UserDTO userDTO, PostDTO postDTO, CommentDTO commentDTO, int react) {
        this.reactId = reactId;
        this.userDTO = userDTO;
        this.postDTO = postDTO;
        this.commentDTO = commentDTO;
        this.react = react;
    }

    public int getReactId() {
        return reactId;
    }

    public void setReactId(int reactId) {
        this.reactId = reactId;
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

    public CommentDTO getCommentDTO() {
        return commentDTO;
    }

    public void setCommentDTO(CommentDTO commentDTO) {
        this.commentDTO = commentDTO;
    }

    public int getReact() {
        return react;
    }

    public void setReact(int react) {
        this.react = react;
    }

    @Override
    public String toString() {
        return "ReactDTO{" +
                "reactId=" + reactId +
                ", userDTO=" + userDTO +
                ", postDTO=" + postDTO +
                ", commentDTO=" + commentDTO +
                ", react=" + react +
                '}';
    }
}
