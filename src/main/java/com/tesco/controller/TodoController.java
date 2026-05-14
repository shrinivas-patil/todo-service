package com.tesco.controller;

import com.tesco.entity.Todo;
import com.tesco.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping
    public Todo saveTodo(@RequestBody Todo todo) {
        return service.saveTodo(todo);
    }
}