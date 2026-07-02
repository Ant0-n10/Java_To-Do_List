package Ant0_n10.todolist.controllers;

import Ant0_n10.todolist.models.Task;
import Ant0_n10.todolist.services.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;


    @PostMapping
    public ResponseEntity<Task> createTask(@Valid @RequestBody Task task){
       Task createdTask = taskService.createTask(task);
       return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> getAllTasks = taskService.getAllTasks();
        return ResponseEntity.status(HttpStatus.OK).body(getAllTasks);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable long id, @Valid @RequestBody Task task){
       Task updatedTask = taskService.updateTask(id, task);
        return ResponseEntity.ok().body(updatedTask);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);

        return ResponseEntity.noContent().build();
    }
}
