package com.digicode.taskstracker.dto;

public class TaskDto {

  private String name;

  public TaskDto(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
