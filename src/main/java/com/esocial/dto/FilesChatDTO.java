package com.esocial.dto;

public class FilesChatDTO {

    private int chatFileId;
    private ChatDTO chatDTO;
    private String fileName;

    public FilesChatDTO() {
    }

    public FilesChatDTO(int chatFileId, ChatDTO chatDTO, String fileName) {
        this.chatFileId = chatFileId;
        this.chatDTO = chatDTO;
        this.fileName = fileName;
    }

    public int getChatFileId() {
        return chatFileId;
    }

    public void setChatFileId(int chatFileId) {
        this.chatFileId = chatFileId;
    }

    public ChatDTO getChatDTO() {
        return chatDTO;
    }

    public void setChatDTO(ChatDTO chatDTO) {
        this.chatDTO = chatDTO;
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
                ", chatDTO=" + chatDTO +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
