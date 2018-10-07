package com.esocial.entity;

import javax.persistence.*;

@Entity
public class FilesPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int postFileId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId",referencedColumnName = "postId")
    private Post post;

    private String fileName;

    public FilesPost() {
    }

    public FilesPost(Post post, String fileName) {
        this.post = post;
        this.fileName = fileName;
    }

    public FilesPost(int postFileId,Post post, String fileName) {
        this.postFileId=postFileId;
        this.post = post;
        this.fileName = fileName;
    }

    public int getPostFileId() {
        return postFileId;
    }

    public void setPostFileId(int postFileId) {
        this.postFileId = postFileId;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "FilesPost{" +
                "postFileId=" + postFileId +
                ", post=" + post +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
