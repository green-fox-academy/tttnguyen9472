package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

//    @GetMapping({"/", "/list"})
//    public String list(Model model) {
//        model.addAttribute("todos", todoService.getAllToDos());
//        return "todolist";
//    }

    @PostMapping("/")
    public String listAllDone(@RequestParam Boolean isDone, Model model) {
        model.addAttribute("todos", todoService.getAllDone());
        return "todolist";
    }

    @GetMapping({"/", "/list"})
    public String list(){

    }

}
