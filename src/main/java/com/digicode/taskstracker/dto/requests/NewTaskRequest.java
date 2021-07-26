package com.digicode.taskstracker.dto.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewTaskRequest {
  private String theme;
  private String description;
  private Long authorId;
  private Long assignedUserId;

  @JsonCreator
  public NewTaskRequest(@JsonProperty("theme") String theme,
                        @JsonProperty("description") String description,
                        @JsonProperty("authorId") Long authorId,
                        @JsonProperty("assignedUserId") Long assignedUserId) {
    this.theme = theme;
    this.description = description;
    this.authorId = authorId;
    this.assignedUserId = assignedUserId;
  }

  public String getTheme() {
    return theme;
  }

  public String getDescription() {
    return description;
  }

  public Long getAuthorId() {
    return authorId;
  }

  public Long getAssignedUserId() {
    return assignedUserId;
  }
}
