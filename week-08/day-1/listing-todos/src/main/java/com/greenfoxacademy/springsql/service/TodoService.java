package com.greenfoxacademy.springsql.service;

import com.greenfoxacademy.springsql.model.Todo;
import com.greenfoxacademy.springsql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllToDos(){
        return (List<Todo>) todoRepository.findAll();
    }

    public void saveTodos(String title){
        todoRepository.save(new Todo(title));
    }
}
