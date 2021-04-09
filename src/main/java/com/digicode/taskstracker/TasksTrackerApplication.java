package com.digicode.taskstracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TasksTrackerApplication {

  public static void main(String[] args) {
    SpringApplication.run(TasksTrackerApplication.class, args);
  }

}
