package com.digicode.taskstracker.repository;

import com.digicode.taskstracker.entity.Task;
import com.digicode.taskstracker.entity.TaskStatus;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

  List<Task> findAllByStatus(TaskStatus status, Sort sort);

  Task findTaskByIdAndCommentsId(Long id, Long commentId);

}
