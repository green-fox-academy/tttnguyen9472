package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {

    private List<Fox> foxList;

    @Autowired
    public LoginService() {
        foxList = new ArrayList<>();
        foxList.add(new Fox("Mr. Green"));
    }


    public String newFoxName(String name) {
        foxList.add(new Fox());
        foxList.get(foxList.size() - 1).setName(name);
        return foxList.get(foxList.size() - 1).getName();
    }

    public List<Fox> getFoxList() {
        return foxList;
    }
}
