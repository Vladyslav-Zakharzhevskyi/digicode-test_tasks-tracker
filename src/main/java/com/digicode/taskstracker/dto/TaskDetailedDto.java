package com.digicode.taskstracker.dto;

import com.digicode.taskstracker.entity.TaskStatus;

import java.util.Date;
import java.util.List;

public class TaskDetailedDto extends TaskDto {

  private List<TaskCommentDto> taskComments;

  private List<TaskAttachmentDto> taskAttachments;

  private RatingDto rating;

  public TaskDetailedDto() {
  }

  public TaskDetailedDto(Long id, String theme, String description, Date creationDate, UserDto creator, UserDto assignedUser, TaskStatus status, List<TaskCommentDto> taskComments, List<TaskAttachmentDto> taskAttachments) {
    super(id, theme, description, creationDate, creator, assignedUser, status);
    this.taskComments = taskComments;
    this.taskAttachments = taskAttachments;
  }

  public List<TaskCommentDto> getTaskComments() {
    return taskComments;
  }

  public List<TaskAttachmentDto> getTaskAttachments() {
    return taskAttachments;
  }

  public RatingDto getRating() {
    return rating;
  }

  public void setRating(RatingDto rating) {
    this.rating = rating;
  }
}
