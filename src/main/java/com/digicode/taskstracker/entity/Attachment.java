package com.digicode.taskstracker.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity(name = "attachments")
public class Attachment {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;

  @ManyToOne
  @JoinColumn(name = "task_id")
  private Task task;

  @Type(type="org.hibernate.type.BinaryType")
  @Column(name = "blob")
  private byte[] attachment;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

  public byte[] getAttachment() {
    return attachment;
  }

  public void setAttachment(byte[] attachment) {
    this.attachment = attachment;
  }
}
