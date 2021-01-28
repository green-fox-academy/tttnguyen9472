package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.model.*;
import com.greenfoxacademy.groot.model.Error;
import com.greenfoxacademy.groot.service.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<?> yondusArrow(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time) {
        if (distance != null || time != null) {
            Arrow arrow = new Arrow(distance, time);
            return ResponseEntity.ok(arrow);
        }
        Error error = new Error("This is an error message!");
        return new ResponseEntity<>(guardianService.errorMessage(), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/rocket")
    public ResponseEntity<?> getActualCargo() {

        return ResponseEntity.ok(guardianService.cargoStatus());
    }

    @GetMapping("/rocket/fill")
    public ResponseEntity<?> fillCargo(@RequestParam(required = false) String caliber, @RequestParam(required = false) Integer amount) {
        if (caliber != null || amount != null) {
            RocketStatus rocketStatus = new RocketStatus(caliber, amount);
            guardianService.cargoFilling(caliber, amount);
            return ResponseEntity.ok(rocketStatus);
        }
        Error error = new Error("This is an error message!");
        return new ResponseEntity<>(guardianService.errorMessage(), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/drax")
    public ResponseEntity<?> getCalorieTable() {
        return ResponseEntity.ok(guardianService.getCalorieTable());
    }

    @PostMapping("/drax")
    public ResponseEntity<Food> addItemsToCalorieTable(@RequestBody(required = false) Food food) {
        guardianService.addFood(food);
        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }

    @DeleteMapping("/drax")
    public ResponseEntity<Food> deleteItemFromCalorieTable(@RequestBody(required = false) Food food) {
        guardianService.deleteFood(food);
        return new ResponseEntity<>(food, HttpStatus.OK);
    }

    @PutMapping("/drax")
    public ResponseEntity<?> updateItemFromCalorieTable(@RequestBody(required = false) Food food) {
        guardianService.updateFood(food);
        return new ResponseEntity<>(food, HttpStatus.OK);
    }


}
