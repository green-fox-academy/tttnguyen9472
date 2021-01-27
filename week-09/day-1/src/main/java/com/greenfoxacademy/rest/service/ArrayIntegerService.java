package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.arrays.ArraysHandler;
import org.springframework.stereotype.Service;

@Service
public class ArrayIntegerService {

    public Integer arrayHandler(ArraysHandler arraysHandler) {

        if (arraysHandler.getWhat().equals("sum")) {
            Integer sum = 0;
            for (int i = 0; i < arraysHandler.getNumbers().length; i++) {
                sum = sum + arraysHandler.getNumbers()[i];
            }
            return sum;
        }
        else {
            Integer multiply = 1;
            for (int i = 0; i < arraysHandler.getNumbers().length; i++) {
                multiply = multiply * arraysHandler.getNumbers()[i];
            }
            return multiply;
        }
    }
}
