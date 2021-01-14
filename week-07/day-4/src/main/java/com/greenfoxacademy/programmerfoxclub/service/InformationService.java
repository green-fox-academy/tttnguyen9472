package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InformationService {

    private LoginService loginService;

    @Autowired
    public InformationService(LoginService loginService) {
        this.loginService = loginService;
    }



    public String foxName() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getName();
    }

    public String foxFood() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getFood();
    }

    public String foxDrink() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getDrink();
    }

    public Integer foxTricks() {
        if (loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList().size() == 0) {
            return 0;
        }
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList().size();
    }

    public List<String> actualFoxTricks() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList();
    }


}
