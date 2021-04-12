package com.digicode.taskstracker.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TaskCommentDto {

  private String comment;
  private UserDto creator;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  private Date creationDate;

  public TaskCommentDto() {
  }

  public TaskCommentDto(String comment, UserDto creator, Date creationDate) {
    this.comment = comment;
    this.creator = creator;
    this.creationDate = creationDate;
  }

  public String getComment() {
    return comment;
  }

  public UserDto getCreator() {
    return creator;
  }

  public Date getCreationDate() {
    return creationDate;
  }
}
