package com.greenfoxacademy.springsql.controller;

import com.greenfoxacademy.springsql.service.TodoService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoService.getAllToDos());
        return "todolist";
    }

}
