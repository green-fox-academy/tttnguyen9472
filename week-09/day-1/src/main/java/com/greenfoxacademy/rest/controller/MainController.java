package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.*;
import com.greenfoxacademy.rest.model.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private Doubling doubling;
    private Error error;

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> doublingPage(@RequestParam(required = false) Integer input) {
        if (input != null) {
            Doubling doubling = new Doubling(input);
            return ResponseEntity.ok(doubling);
        }
        Error error = new Error("Please provide an input!");
        return ResponseEntity.ok(error);
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeterPage(@RequestParam(required = false) String name, String title) {
        if (name != null && title != null) {
            Greeter greeter = new Greeter(name, title);
            return ResponseEntity.ok(greeter);
        } else if (name == null && title == null) {
            Error error = new Error("Please provide a name and a title!");
            return ResponseEntity.badRequest().body(error);
        } else if (name == null) {
            Error error = new Error("Please provide a name!");
            return ResponseEntity.ok(error);
        } else {
            Error error = new Error("Please provide a title!");
            return ResponseEntity.badRequest().body(error);
        }
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> AppendAPage(@PathVariable String appendable) {
        if (appendable != null) {
            AppendA appendA = new AppendA(appendable);
            return ResponseEntity.ok(appendA);
        }

        return ResponseEntity.notFound().build();
    }


    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntilPage(@PathVariable String action, @RequestBody Until until) {
        if (action.equals("sum") || (action.equals("factor"))) {
            DoUntil doUntil = new DoUntil(action, until.getUntil());
            return ResponseEntity.ok(doUntil);
        }
        Error error = new Error("Please provide a number!");
        return ResponseEntity.badRequest().body(error);
    }
}
