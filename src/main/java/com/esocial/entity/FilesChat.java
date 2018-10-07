package com.esocial.entity;

import javax.persistence.*;

@Entity
public class FilesChat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int chatFileId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatId",referencedColumnName = "chatId")
    private Chat chat;

    private String fileName;

    public FilesChat() {
    }

    public FilesChat(Chat chat, String fileName) {
        this.chat = chat;
        this.fileName = fileName;
    }

    public FilesChat(int chatFileId,Chat chat, String fileName) {
        this.chatFileId=chatFileId;
        this.chat = chat;
        this.fileName = fileName;
    }

    public int getChatFileId() {
        return chatFileId;
    }

    public void setChatFileId(int chatFileId) {
        this.chatFileId = chatFileId;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "FilesChat{" +
                "chatFileId=" + chatFileId +
                ", chat=" + chat +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
