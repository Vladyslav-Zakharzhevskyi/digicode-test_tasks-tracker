package com.digicode.taskstracker.dto.requests;

import com.digicode.taskstracker.models.TaskStatus;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateTaskRequest {

  private String newStatus;
  private Long assignedUseId;

  @JsonCreator
  public UpdateTaskRequest(@JsonProperty("newStatus") String newStatus,
                           @JsonProperty("assignedUseId") Long assignedUseId) {
    this.newStatus = newStatus;
    this.assignedUseId = assignedUseId;
  }

  public String getNewStatus() {
    return newStatus;
  }

  public Long getAssignedUseId() {
    return assignedUseId;
  }
}
