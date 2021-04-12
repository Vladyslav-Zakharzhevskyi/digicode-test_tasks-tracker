package com.digicode.taskstracker.controllers;

import com.digicode.taskstracker.dto.TaskDetailedDto;
import com.digicode.taskstracker.dto.TaskDto;
import com.digicode.taskstracker.dto.requests.NewTaskRequest;
import com.digicode.taskstracker.dto.requests.UpdateTaskRequest;
import com.digicode.taskstracker.entity.Task;
import com.digicode.taskstracker.entity.TaskStatus;
import com.digicode.taskstracker.repository.TaskRepository;
import com.google.common.base.Strings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("tasks")
public class TasksController {

  @Autowired
  private ModelMapper mapper;

  @Autowired
  private TaskRepository taskRepository;

  @GetMapping(path = "")
  public List<TaskDto> getTasks(@RequestParam(name = "status", required = false) String status,
                                @RequestParam(name = "sort", required = false, defaultValue = "asc") String sort) {

    Optional<Sort.Direction> directionOptional = Sort.Direction.fromOptionalString(sort);
    Sort.Direction direction = directionOptional.orElse(Sort.DEFAULT_DIRECTION);
    Sort dateCreated = Sort.by(direction, "createdDate");

    List<Task> tasks = Collections.emptyList();

    if (Strings.isNullOrEmpty(status)) {
      tasks = taskRepository.findAll(dateCreated);
    } else {
      TaskStatus taskStatus = TaskStatus.fromOptionalString(status).orElse(TaskStatus.NEW);
      taskRepository.findAllByStatus(taskStatus, dateCreated);
    }

    List<TaskDto> taskDtos = tasks.stream()
            .map(task -> mapper.map(task, TaskDto.class))
            .collect(Collectors.toList());

    return taskDtos;
  }

  @GetMapping(path = "{taskId}")
  public TaskDetailedDto getTask(@PathVariable(name = "taskId") Long taskId) {
    return null;
  }

  @PostMapping(path = "")
  @ResponseStatus(HttpStatus.CREATED)
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
