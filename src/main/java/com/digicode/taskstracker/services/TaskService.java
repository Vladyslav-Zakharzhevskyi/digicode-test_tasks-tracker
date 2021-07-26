package com.digicode.taskstracker.services;

import com.digicode.taskstracker.dto.TaskDetailedDto;
import com.digicode.taskstracker.dto.requests.UpdateTaskRequest;
import com.digicode.taskstracker.entity.Task;
import javassist.NotFoundException;

public interface TaskService {

  TaskDetailedDto getTaskWithRating(Long taskId);

  TaskDetailedDto getTaskWithRating(Task task);

  Task save(Task task);

  Task update(Long taskId, UpdateTaskRequest request);

  Task addComment(Long taskId, Long userId, String comment);

  Task deleteComment(Long taskId, Long commentId) throws NotFoundException;

}
