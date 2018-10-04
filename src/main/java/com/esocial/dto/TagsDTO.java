package com.esocial.dto;

public class TagsDTO {

    private int tagId;
    private UserDTO userDTO;
    private PostDTO postDTO;

    public TagsDTO() {
    }

    public TagsDTO(int tagId, UserDTO userDTO, PostDTO postDTO) {
        this.tagId = tagId;
        this.userDTO = userDTO;
        this.postDTO = postDTO;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
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

    @Override
    public String toString() {
        return "TagsDTO{" +
                "tagId=" + tagId +
                ", userDTO=" + userDTO +
                ", postDTO=" + postDTO +
                '}';
    }
}
