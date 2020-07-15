package com.example.todolist.controller;

import javax.validation.Valid;

import com.example.todolist.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import com.example.todolist.model.Todo;
import com.example.todolist.repository.TodoRepository;
import com.example.todolist.repository.UserRepository;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/todos")
    public Page<Todo> getTodos(Pageable pageable) {
        return todoRepository.findAll(pageable);
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable Long id) {
        return todoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @PostMapping("/users/{userId}/todos")
    public Todo createTodo(@PathVariable Long userId, @Valid @RequestBody Todo todo) {
        return userRepository.findById(userId).map(user -> {
            todo.setUser(user);
            return todoRepository.save(todo);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @PutMapping("/users/{userId}/todos/{todoId}")
    public Todo updateTodo(@PathVariable Long userId, @PathVariable Long todoId, @Valid @RequestBody Todo updatedTodo) {
        return userRepository.findById(userId).map(user -> todoRepository.findById(todoId).map(todo -> {
            todo.setContent(updatedTodo.getContent());
            todo.setCompleted(updatedTodo.getCompleted());
            todo.setDueDate(updatedTodo.getDueDate());
            todo.setPriority(updatedTodo.getPriority());
            todo.setTitle(updatedTodo.getTitle());
            todo.setUser(user);
            return todoRepository.save(todo);
        }).orElseThrow(() -> new ResourceNotFoundException("Todo not found"))
        ).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @DeleteMapping("/todos/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable Long id) {
        return todoRepository.findById(id).map(todo -> {
            todoRepository.delete(todo);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Todo not found"));
    }
}
