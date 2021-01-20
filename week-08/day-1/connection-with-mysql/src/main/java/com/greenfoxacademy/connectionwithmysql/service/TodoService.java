package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    public Todo saveEditedTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long id) {
        if (todoRepository.findById(id).isPresent()) {
            return todoRepository.findById(id).get();
        }
        return null;
    }
}


