package com.digicode.taskstracker.controllers;

import com.digicode.taskstracker.dto.TaskDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("tasks")
public class TasksController {

  @RequestMapping(path = "", method = RequestMethod.GET)
  public List<TaskDto> getTasks() {
    return Collections.EMPTY_LIST;
  }

}
