package com.esocial.dto;

public class FilesPostDTO {

    private int postFileId;
    private int postId;
    private String fileName;

    public FilesPostDTO() {
    }

    public FilesPostDTO(int postFileId, int postId, String fileName) {
        this.postFileId = postFileId;
        this.postId = postId;
        this.fileName = fileName;
    }

    public int getPostFileId() {
        return postFileId;
    }

    public void setPostFileId(int postFileId) {
        this.postFileId = postFileId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
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
                ", postId=" + postId +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
