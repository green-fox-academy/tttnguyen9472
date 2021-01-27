package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.model.Error;
import com.greenfoxacademy.groot.model.Groot;
import com.greenfoxacademy.groot.model.Yondu;
import com.greenfoxacademy.groot.service.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    private GuardianService guardianService;

    @Autowired
    public GuardianController(GuardianService guardianService) {
        this.guardianService = guardianService;
    }

    @GetMapping("/groot")
    public ResponseEntity<?> translateGroot(@RequestParam(required = false) String message) {
        if (message != null) {
            Groot groot = new Groot(message);
            return ResponseEntity.ok(groot);
        }
        Error error = new Error("This is an error message!");
        return new ResponseEntity<>(guardianService.errorMessage(), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/yondu")
    public ResponseEntity<?> yondusArrow(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time){
        if (distance != null || time != null) {
            Yondu yondu = new Yondu(distance, time);
            return ResponseEntity.ok(yondu);
        }
        Error error = new Error("This is an error message!");
        return new ResponseEntity<>(guardianService.errorMessage(), HttpStatus.BAD_REQUEST);
    }

}
