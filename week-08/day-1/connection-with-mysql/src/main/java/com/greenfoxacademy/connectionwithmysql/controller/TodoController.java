package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping({"", "/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isActive) {
        model.addAttribute("todos", todoService.getAllToDos());
        return "todolist";
    }

    @GetMapping("/todo")
    public String listUnDone(@RequestParam Boolean isActive, Model model) {
        model.addAttribute("todos", todoService.getAllUndone(isActive));
        return "todolist";
    }

    @GetMapping("/add")
    public String addTodos() {
        return "add-todo";
    }

    @PostMapping("/add")
    public String addTodosPost(Todo todo) {
        todoService.addTodos(todo);
        return "redirect:/";
    }


    @PostMapping("/{id}/delete")
    public String deleteToDo(@PathVariable long id) {
        todoService.deleteTodo(id);
        return "redirect:/";
    }
}
