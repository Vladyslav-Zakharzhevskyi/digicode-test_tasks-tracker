package com.digicode.taskstracker.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "attachments")
public class Attachment extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "task_id")
  private Task task;

  @Type(type="org.hibernate.type.BinaryType")
  @Column(name = "blob")
  private byte[] blob;

  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

  public byte[] getBlob() {
    return blob;
  }

  public void setBlob(byte[] attachment) {
    this.blob = attachment;
  }
}
