package Ant0_n10.todolist.services;

import Ant0_n10.todolist.enumerations.StatusTask;
import Ant0_n10.todolist.models.Task;
import Ant0_n10.todolist.repositorys.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task createTask(Task task) {
        task.setStatus(StatusTask.PENDING);
        return taskRepository.save(task);
    }
}
