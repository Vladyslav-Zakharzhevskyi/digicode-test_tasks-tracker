package com.digicode.taskstracker.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public class TaskAttachmentDto {

  private String fileName;
  private byte[] blob;

  public TaskAttachmentDto(String fileName, byte[] blob) {
    this.fileName = fileName;
    this.blob = blob;
  }

  public String getFileName() {
    return fileName;
  }

  public byte[] getBlob() {
    return blob;
  }
}
