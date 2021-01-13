package com.greenfoxacademy.hellobeanworld.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service
public class UtilityService {

    private List<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }


    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }

    public List<String> validateEmail(String email){
        List<String> returnList = new ArrayList<>();
        if (email.contains("@") && email.contains(".")){
            returnList.add(email + " is a valid email address.");
            returnList.add("green");
            return returnList;
        } else {
            returnList.add(email + " is not valid email address.");
            returnList.add("red");
            return returnList;
        }

    }
}