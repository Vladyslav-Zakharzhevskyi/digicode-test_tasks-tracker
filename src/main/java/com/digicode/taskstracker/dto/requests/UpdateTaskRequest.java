package com.digicode.taskstracker.dto.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateTaskRequest {

  private String newStatus;
  private Long newAssignedUseId;

  @JsonCreator
  public UpdateTaskRequest(@JsonProperty("newStatus") String newStatus,
                           @JsonProperty("newAssignedUseId") Long newAssignedUseId) {
    this.newStatus = newStatus;
    this.newAssignedUseId = newAssignedUseId;
  }

  public String getNewStatus() {
    return newStatus;
  }

  public Long getNewAssignedUseId() {
    return newAssignedUseId;
  }
}
