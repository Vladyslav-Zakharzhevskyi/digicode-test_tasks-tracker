package com.digicode.taskstracker.dto.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewTaskRequest {
  private String theme;
  private String description;
  private Long creatorId;
  private Long assignedUserId;

  @JsonCreator
  public NewTaskRequest(@JsonProperty("theme") String theme,
                        @JsonProperty("description") String description,
                        @JsonProperty("creatorId") Long creatorId,
                        @JsonProperty("assignedUserId") Long assignedUserId) {
    this.theme = theme;
    this.description = description;
    this.creatorId = creatorId;
    this.assignedUserId = assignedUserId;
  }

  public String getTheme() {
    return theme;
  }

  public String getDescription() {
    return description;
  }

  public Long getCreatorId() {
    return creatorId;
  }

  public Long getAssignedUserId() {
    return assignedUserId;
  }
}
