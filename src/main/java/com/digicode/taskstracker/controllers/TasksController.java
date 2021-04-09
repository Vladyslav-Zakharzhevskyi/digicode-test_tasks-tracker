package com.digicode.taskstracker.controllers;

import com.digicode.taskstracker.dto.TaskDetailedDto;
import com.digicode.taskstracker.dto.TaskDto;
import com.digicode.taskstracker.dto.requests.NewTaskRequest;
import com.digicode.taskstracker.dto.requests.UpdateTaskRequest;
import com.google.common.net.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasks")
public class TasksController {

  @GetMapping(path = "")
  public List<TaskDto> getTasks() {
    return null;
  }

  @GetMapping(path = "{taskId}")
  public TaskDetailedDto getTask(@PathVariable(name = "taskId") Long taskId) {
    return null;
  }

  @PostMapping(path = "")
  public TaskDetailedDto createTask(@ModelAttribute NewTaskRequest newTaskRequest) {

    return null;
  }

  @PutMapping(path = "{taskId}")
  public TaskDetailedDto updateTask(@PathVariable(name = "taskId") Long taskId,
                                    @ModelAttribute UpdateTaskRequest updateTaskRequest) {
    return null;
  }

  @PostMapping(path = "{taskId}/comment")
  public TaskDetailedDto addComment(@PathVariable(name = "taskId") Long taskId,
                                    @RequestParam(name = "comment") String comment) {
    return null;
  }

  @DeleteMapping(path = "{taskId}/comment/{commentId}")
  public ResponseEntity<String> removeComment(@PathVariable(name = "taskId") Long taskId,
                                              @PathVariable(name = "commentId") Long commentId) {
    return ResponseEntity.ok("Removed successfully");
  }


}
