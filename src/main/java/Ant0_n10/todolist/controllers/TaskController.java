package Ant0_n10.todolist.controllers;

import Ant0_n10.todolist.models.Task;
import Ant0_n10.todolist.services.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
