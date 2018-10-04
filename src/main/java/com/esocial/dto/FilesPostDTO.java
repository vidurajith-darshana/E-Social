package com.esocial.dto;

public class FilesPostDTO {

    private int postFileId;
    private PostDTO postDTO;
    private String fileName;

    public FilesPostDTO() {
    }

    public FilesPostDTO(int postFileId, PostDTO postDTO, String fileName) {
        this.postFileId = postFileId;
        this.postDTO = postDTO;
        this.fileName = fileName;
    }

    public int getPostFileId() {
        return postFileId;
    }

    public void setPostFileId(int postFileId) {
        this.postFileId = postFileId;
    }

    public PostDTO getPostDTO() {
        return postDTO;
    }

    public void setPostDTO(PostDTO postDTO) {
        this.postDTO = postDTO;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "FilesPostDTO{" +
                "postFileId=" + postFileId +
                ", postDTO=" + postDTO +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
