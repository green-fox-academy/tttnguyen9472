package com.greenfoxacademy.springsql;

import com.greenfoxacademy.springsql.model.Todo;
import com.greenfoxacademy.springsql.repository.TodoRepository;
import com.greenfoxacademy.springsql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsqlApplication implements CommandLineRunner {
    private TodoService todoService;

    @Autowired
    public SpringsqlApplication(TodoService todoService) {
        this.todoService = todoService;
    }

    @Override
    public void run(String... args) throws Exception {
        todoService.saveTodos("Start the day");
        todoService.saveTodos("Finish H2 workshop1");
        todoService.saveTodos("Finish JPA workshop2");
        todoService.saveTodos("Create a CRUD project");
        todoService.getAllToDos();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringsqlApplication.class, args);
    }




}
