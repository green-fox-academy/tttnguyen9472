package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.arrays.ArraysHandler;
import org.springframework.stereotype.Service;

@Service
public class ArrayArrayService {

    public Integer[] arrayArrayHandlerService(ArraysHandler arraysHandler) {

        for (int i = 0; i < arraysHandler.getNumbers().length; i++) {
            arraysHandler.getNumbers()[i] = arraysHandler.getNumbers()[i] * 2;
        }
        return arraysHandler.getNumbers();
    }
}
