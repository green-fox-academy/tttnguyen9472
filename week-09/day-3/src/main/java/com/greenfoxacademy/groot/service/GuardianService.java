package com.greenfoxacademy.groot.service;

import com.greenfoxacademy.groot.model.Error;
import com.greenfoxacademy.groot.model.Groot;
import com.greenfoxacademy.groot.model.Yondu;
import org.springframework.stereotype.Service;

@Service
public class GuardianService {

    public Groot translateToGroot(String message){
        return new Groot(message);
    }

    public Error errorMessage(){
        return new Error("This is an error message!");
    }

    public Yondu getArrow(Double distance, Double time){
        return new Yondu(distance, time);
    }
}
