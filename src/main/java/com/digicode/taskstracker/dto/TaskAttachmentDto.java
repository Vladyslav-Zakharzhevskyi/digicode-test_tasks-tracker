package com.digicode.taskstracker.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public class TaskAttachmentDto {

  private Long id;
  private String fileName;
  private byte[] blob;

  public TaskAttachmentDto() {
  }

  public TaskAttachmentDto(Long id, String fileName, byte[] blob) {
    this.id = id;
    this.fileName = fileName;
    this.blob = blob;
  }

  public Long getId() {
    return id;
  }

  public String getFileName() {
    return fileName;
  }

  public byte[] getBlob() {
    return blob;
  }
}
