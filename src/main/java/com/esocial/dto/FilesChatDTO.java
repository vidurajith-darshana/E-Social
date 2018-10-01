package com.esocial.dto;

public class FilesChatDTO {

    private int chatFileId;
    private int chatId;
    private String fileName;

    public FilesChatDTO() {
    }

    public FilesChatDTO(int chatFileId, int chatId, String fileName) {
        this.chatFileId = chatFileId;
        this.chatId = chatId;
        this.fileName = fileName;
    }

    public int getChatFileId() {
        return chatFileId;
    }

    public void setChatFileId(int chatFileId) {
        this.chatFileId = chatFileId;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "FilesChatDTO{" +
                "chatFileId=" + chatFileId +
                ", chatId=" + chatId +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
