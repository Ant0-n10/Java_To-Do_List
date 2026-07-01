package Ant0_n10.todolist.services;

import Ant0_n10.todolist.models.Task;
import Ant0_n10.todolist.repositorys.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final Task task;

}
