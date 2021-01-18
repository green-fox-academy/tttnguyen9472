package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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


    public void addTodos(Todo todo){
        todoRepository.save(todo);
    }



    public Optional<List<Todo>> getAllDone(){
        return todoRepository.findAllByIsDoneTrue().stream()
                .filter(f -> f.getIsDone().equals(true))
                .collect(Collectors.toList());
    }
}
