package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMysqlApplication implements CommandLineRunner {

    private TodoService todoService;


    @Autowired
    public ConnectionWithMysqlApplication(TodoService todoService) {
        this.todoService = todoService;
    }



    public static void main(String[] args) {
        SpringApplication.run(ConnectionWithMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoService.addTodos(new Todo("Start the day"));
        todoService.addTodos(new Todo("Finish H2 workshop1"));
        todoService.addTodos(new Todo("Finish JPA workshop2"));
        todoService.addTodos(new Todo("Create a CRUD project"));
        todoService.addTodos(new Todo("Eat bread", true, true));
        todoService.addTodos(new Todo("Drink milk", true, true));
        todoService.addTodos(new Todo("End of the day", true, true));

    }
}
