package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.*;
import com.greenfoxacademy.rest.model.Error;
import com.greenfoxacademy.rest.model.arrays.ArraysArrayResult;
import com.greenfoxacademy.rest.model.arrays.ArraysHandler;
import com.greenfoxacademy.rest.model.arrays.ArraysIntegerResult;
import com.greenfoxacademy.rest.model.dountil.DoUntil;
import com.greenfoxacademy.rest.model.dountil.Until;
import com.greenfoxacademy.rest.model.logs.Log;
import com.greenfoxacademy.rest.model.logs.LogEntries;
import com.greenfoxacademy.rest.service.ArrayArrayService;
import com.greenfoxacademy.rest.service.ArrayIntegerService;
import com.greenfoxacademy.rest.service.LogEntriesService;
import com.greenfoxacademy.rest.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private ArrayIntegerService arrayIntegerService;
    private ArrayArrayService arrayArrayService;
    private LogService logService;
    private LogEntriesService logEntriesService;

    LogEntries logEntries = new LogEntries();

    @Autowired
    public MainController(ArrayIntegerService arrayIntegerService, ArrayArrayService arrayArrayService, LogService logService, LogEntriesService logEntriesService) {
        this.arrayIntegerService = arrayIntegerService;
        this.arrayArrayService = arrayArrayService;
        this.logService = logService;
        this.logEntriesService = logEntriesService;
    }

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> doublingPage(@RequestParam(required = false) Integer input, @ModelAttribute Log log) {
        if (input != null) {
            logService.setLog(log, "/doubling", "input=" + input.toString());
            logService.saveLog(log);
            logEntriesService.addLog(logEntries, log);
            Doubling doubling = new Doubling(input);
            return ResponseEntity.ok(doubling);
        }
        Error error = new Error("Please provide an input!");
        return ResponseEntity.ok(error);
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeterPage(@RequestParam(required = false) String name, String title, @ModelAttribute Log log) {
        if (name != null && title != null) {
            logService.setLog(log, "/greeter", "name=" + name + "&title=" + title);
            logService.saveLog(log);
            logEntriesService.addLog(logEntries, log);
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
    public ResponseEntity<?> AppendAPage(@PathVariable String appendable, @ModelAttribute Log log) {
        if (appendable != null) {
            logService.setLog(log, "/appenda", "/" + appendable);
            logService.saveLog(log);
            logEntriesService.addLog(logEntries, log);
            AppendA appendA = new AppendA(appendable);
            return ResponseEntity.ok(appendA);
        }

        return ResponseEntity.notFound().build();
    }


    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntilPage(@PathVariable String action, @RequestBody Until until, @ModelAttribute Log log) {
        if (action.equals("sum") || (action.equals("factor"))) {
            logService.setLog(log, "/dountil", "/" + action);
            logService.saveLog(log);
            logEntriesService.addLog(logEntries, log);
            DoUntil doUntil = new DoUntil(action, until.getUntil());
            return ResponseEntity.ok(doUntil);
        }
        Error error = new Error("Please provide a number!");
        return ResponseEntity.badRequest().body(error);
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arraysPage(@RequestBody ArraysHandler arraysHandler, @ModelAttribute Log log) {
        if (arraysHandler.getNumbers() != null || arraysHandler.getWhat() != null) {
            logService.setLog(log, "/arrays", "what=" + arraysHandler.getWhat() + "&numbers=" + arraysHandler.getNumbers());
            logService.saveLog(log);
            logEntriesService.addLog(logEntries, log);
            if (arraysHandler.getWhat().equals("sum") || (arraysHandler.getWhat().equals("multiply"))) {
                ArraysIntegerResult arraysIntegerResult = new ArraysIntegerResult();
                arraysIntegerResult.setResult(arrayIntegerService.arrayHandler(arraysHandler));
                return ResponseEntity.ok(arraysIntegerResult);
            }
            if (arraysHandler.getWhat().equals("double")) {
                logService.setLog(log, "/arrays", "what=" + arraysHandler.getWhat() + "&numbers=" + arraysHandler.getNumbers());
                logService.saveLog(log);
                logEntriesService.addLog(logEntries, log);
                ArraysArrayResult arraysArrayResult = new ArraysArrayResult();
                arraysArrayResult.setArray(arrayArrayService.arrayArrayHandlerService(arraysHandler));
                return ResponseEntity.ok(arraysArrayResult);
            }
        } else {
            Error error = new Error("Please provide what to do with the numbers!");
            return ResponseEntity.badRequest().body(error);
        }
        Error error = new Error("Please provide what to do with the numbers!");
        return ResponseEntity.badRequest().body(error);
    }

    @GetMapping("/log")
    public ResponseEntity<?> logPage(){
        return ResponseEntity.ok(logEntries);
    }

    @PostMapping("/sith")
    public ResponseEntity<?> receiveSithText(){

    }



//    @PostMapping("/arrays")
//    public ResponseEntity<?> arraysPage(@RequestBody ArraysHandler arraysHandler) {
//        System.out.println(arraysHandler.getWhat());
//        if (arraysHandler.getWhat().equals("sum")) {
//            Integer sum = 0;
//            for (int i = 0; i <= arraysHandler.getNumbers().length; i++) {
//                sum = sum + arraysHandler.getNumbers()[i];
//            }
//            return ResponseEntity.ok(new ArraysResult(sum));
//        }
//        if (arraysHandler.getWhat().equals("multiply")) {
//            Integer multiply = 1;
//            for (int i = 1; i <= arraysHandler.getNumbers().length; i++) {
//                multiply = multiply * arraysHandler.getNumbers()[i];
//            }
//            return ResponseEntity.ok(new ArraysResult(multiply));
//        }
//        if (arraysHandler.getWhat().equals("double")){
//            return ResponseEntity.ok(new ArraysArrayResult(arraysHandler.getNumbers()));
//        } else {
//            Error error = new Error("Please provide what to do with the numbers!");
//            return ResponseEntity.badRequest().body(error);
//        }
//    }

//    @PostMapping("/arrays")
//    public ResponseEntity<?> arraysPage(@RequestBody What what, Integer[] numbers) {
//        if (what.equals("sum") || (what.equals("factor")) || (what.equals("double"))) {
//            ArraysHandler arraysHandler = new ArraysHandler(what.getWhat(), numbers);
//            return ResponseEntity.ok(arraysHandler);
//        }
//        Error error = new Error("Please provide what to do with the numbers!");
//        return ResponseEntity.badRequest().body(error);
//    }


}
