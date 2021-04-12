package com.digicode.taskstracker.dto;

public class UserDto {

  private Long id;
  private String name;
  private DepartmentDto department;

  public UserDto() {
  }

  public UserDto(Long id, String name, DepartmentDto department) {
    this.id = id;
    this.name = name;
    this.department = department;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public DepartmentDto getDepartment() {
    return department;
  }
}
