package com.digicode.taskstracker.entity;

import java.util.Optional;

public enum TaskStatus {
  NEW,
  OPEN,
  IN_PROGRESS,
  FINISHED,
  CLOSED;

  public static Optional<TaskStatus> fromOptionalString(String value) {

    try {
      return java.util.Optional.of(TaskStatus.valueOf(value));
    } catch (IllegalArgumentException e) {
      return java.util.Optional.empty();
    }
  }

}
