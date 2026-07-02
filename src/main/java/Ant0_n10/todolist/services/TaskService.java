package Ant0_n10.todolist.services;

import Ant0_n10.todolist.enumerations.StatusTask;
import Ant0_n10.todolist.models.Task;
import Ant0_n10.todolist.repositorys.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task createTask(Task task) {
        task.setStatus(StatusTask.PENDING);
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }


    public Task updateTask(Long id, Task task) {
       Task taskUpdate = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada com o ID: " + id));
       taskUpdate.setDescription(task.getDescription());
       taskUpdate.setStatus(task.getStatus());

       return taskRepository.save(taskUpdate);
    }

    public void deleteTask(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Não é possível deletar. Tarefa não encontrada com o ID: " + id);
        }
        taskRepository.deleteById(id);
    }
}
