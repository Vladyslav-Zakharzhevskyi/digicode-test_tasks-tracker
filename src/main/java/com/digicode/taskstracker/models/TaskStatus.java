package com.digicode.taskstracker.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Enums;

public enum TaskStatus {
  NEW,
  OPEN,
  IN_PROGRESS,
  FINISHED,
  CLOSED,
}
