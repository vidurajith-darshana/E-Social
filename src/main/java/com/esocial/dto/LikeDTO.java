package com.esocial.dto;

public class LikeDTO {

    private int likeId;
    private UserDTO userDTO;
    private PostDTO postDTO;
    private CommentDTO commentDTO;
    private int react;

    public LikeDTO() {
    }

    public LikeDTO(int likeId, UserDTO userDTO, PostDTO postDTO, CommentDTO commentDTO, int react) {
        this.likeId = likeId;
        this.userDTO = userDTO;
        this.postDTO = postDTO;
        this.commentDTO = commentDTO;
        this.react = react;
    }

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
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
        return "LikeDTO{" +
                "likeId=" + likeId +
                ", userDTO=" + userDTO +
                ", postDTO=" + postDTO +
                ", commentDTO=" + commentDTO +
                ", react=" + react +
                '}';
    }
}
