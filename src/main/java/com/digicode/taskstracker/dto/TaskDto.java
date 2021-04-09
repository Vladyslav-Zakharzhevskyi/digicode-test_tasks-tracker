package com.digicode.taskstracker.dto;

import com.digicode.taskstracker.models.TaskStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TaskDto {

  private String theme;
  private String description;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  private Date creationDate;
  private UserDto creator;
  private UserDto assignedUser;
  private TaskStatus status;

  public TaskDto(String theme, String description, Date creationDate, UserDto creator, UserDto assignedUser, TaskStatus status) {
    this.theme = theme;
    this.description = description;
    this.creationDate = creationDate;
    this.creator = creator;
    this.assignedUser = assignedUser;
    this.status = status;
  }

  public String getTheme() {
    return theme;
  }

  public String getDescription() {
    return description;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public UserDto getCreator() {
    return creator;
  }

  public UserDto getAssignedUser() {
    return assignedUser;
  }

  public TaskStatus getStatus() {
    return status;
  }
}
