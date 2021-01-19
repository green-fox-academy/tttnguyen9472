package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
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

    public List<Todo> getAllToDos() {
        return (List<Todo>) todoRepository.findAll();
    }


    public void addTodos(Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> getAllUndone(Boolean isActive) {
        return todoRepository.findAllByIsDone(!isActive);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
