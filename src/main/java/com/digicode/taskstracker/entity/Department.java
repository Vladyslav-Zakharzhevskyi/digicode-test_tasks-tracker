package com.digicode.taskstracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "departments")
public class Department extends BaseEntity {

  @Column(name = "name")
  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
