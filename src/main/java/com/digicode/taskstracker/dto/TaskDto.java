package com.digicode.taskstracker.dto;

import com.digicode.taskstracker.entity.TaskStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TaskDto {

  private Long id;
  private String theme;
  private String description;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  private Date createdDate;
  private UserDto author;
  private UserDto assignedUser;
  private TaskStatus status;

  public TaskDto() {
  }

  public TaskDto(Long id, String theme, String description, Date createdDate, UserDto author, UserDto assignedUser, TaskStatus status) {
    this.id = id;
    this.theme = theme;
    this.description = description;
    this.createdDate = createdDate;
    this.author = author;
    this.assignedUser = assignedUser;
    this.status = status;
  }

  public Long getId() {
    return id;
  }

  public String getTheme() {
    return theme;
  }

  public String getDescription() {
    return description;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public UserDto getAuthor() {
    return author;
  }

  public UserDto getAssignedUser() {
    return assignedUser;
  }

  public TaskStatus getStatus() {
    return status;
  }
}
