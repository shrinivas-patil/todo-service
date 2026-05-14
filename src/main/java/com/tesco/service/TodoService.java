package com.tesco.service;

import com.tesco.entity.Todo;
import com.tesco.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Todo saveTodo(Todo todo) {
        return repository.save(todo);
    }
}
