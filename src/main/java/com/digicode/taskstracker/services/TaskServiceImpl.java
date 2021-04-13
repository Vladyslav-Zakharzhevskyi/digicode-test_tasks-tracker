package com.digicode.taskstracker.services;

import com.digicode.taskstracker.dto.RatingDto;
import com.digicode.taskstracker.dto.TaskDetailedDto;
import com.digicode.taskstracker.dto.requests.UpdateTaskRequest;
import com.digicode.taskstracker.entity.Comment;
import com.digicode.taskstracker.entity.Task;
import com.digicode.taskstracker.entity.TaskStatus;
import com.digicode.taskstracker.entity.User;
import com.digicode.taskstracker.repository.CommentRepository;
import com.digicode.taskstracker.repository.TaskRepository;
import com.digicode.taskstracker.repository.UserRepository;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;

@Service
public class TaskServiceImpl implements TaskService {

  @Autowired
  private ModelMapper modelMapper;

  @Autowired
  private TaskRepository taskRepository;

  @Autowired
  private ThirdPartyRatingService ratingService;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private CommentRepository commentRepository;


  @Override
  public TaskDetailedDto getTaskWithRating(Long taskId) {
    Task task = taskRepository.getOne(taskId);
    return getTaskWithRating(task);
  }

  @Override
  public TaskDetailedDto getTaskWithRating(Task task) {
    TaskDetailedDto taskDetailedDto = modelMapper.map(task, TaskDetailedDto.class);
    RatingDto taskRating = ratingService.getTaskRating(task.getId());
    taskDetailedDto.setRating(taskRating);
    return taskDetailedDto;
  }

  @Override
  public Task save(Task task) {
    task.setStatus(TaskStatus.NEW);
    task.setCreatedDate(Date.from(Instant.now()));

    return taskRepository.save(task);
  }

  @Override
  public Task update(Long taskId, UpdateTaskRequest request) {
    Task task = taskRepository.getOne(taskId);
    User newUser = userRepository.getOne(request.getNewAssignedUseId());
    task.setAssignedUser(newUser);
    TaskStatus newStatus = TaskStatus.fromOptionalString(request.getNewStatus())
            .orElse(TaskStatus.NEW);
    task.setStatus(newStatus);

    return taskRepository.save(task);
  }

  @Override
  public Task addComment(Long taskId, Long userId, String comment) {
    Task task = taskRepository.getOne(taskId);
    User user = userRepository.getOne(userId);
    Comment commentObj = new Comment();
    commentObj.setAuthor(user);
    commentObj.setTask(task);
    commentObj.setComment(comment);
    task.getComments().add(commentObj);
    return taskRepository.save(task);
  }

  @Override
  public Task deleteComment(Long taskId, Long commentId) throws NotFoundException {
    Task task = taskRepository.getOne(taskId);

    Comment foundComment = task.getComments().stream()
            .filter(comment -> comment.getId().equals(commentId))
            .findFirst()
            .orElseThrow(() -> new NotFoundException("Comment has not found"));

    commentRepository.delete(foundComment);
    return taskRepository.getOne(taskId);
  }

}
