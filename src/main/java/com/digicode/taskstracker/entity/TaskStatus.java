package com.digicode.taskstracker.entity;

import org.springframework.data.domain.Sort;

import java.util.Locale;
import java.util.Optional;

public enum TaskStatus {
  NEW,
  OPEN,
  IN_PROGRESS,
  FINISHED,
  CLOSED,
  SKIPPED;

  public static Optional<TaskStatus> fromOptionalString(String value) {

    try {
      return java.util.Optional.of(fromString(value));
    } catch (IllegalArgumentException e) {
      return java.util.Optional.empty();
    }
  }

  public static TaskStatus fromString(String value) {
    try {
      return TaskStatus.valueOf(value.toUpperCase(Locale.US));
    } catch (Exception e) {
      throw new IllegalArgumentException(String.format(
              "Invalid value '%s'", value), e);
    }
  }

}
