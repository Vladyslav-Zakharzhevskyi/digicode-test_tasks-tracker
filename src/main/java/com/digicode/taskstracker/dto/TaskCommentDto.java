package com.digicode.taskstracker.dto;

public class TaskCommentDto {

  private Long id;
  private String comment;
  private UserDto author;

  public TaskCommentDto() {
  }

  public TaskCommentDto(Long id, String comment, UserDto author) {
    this.id = id;
    this.comment = comment;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public String getComment() {
    return comment;
  }

  public UserDto getAuthor() {
    return author;
  }
}
