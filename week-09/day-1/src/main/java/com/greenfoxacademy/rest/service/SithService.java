package com.greenfoxacademy.rest.service;

import org.springframework.stereotype.Service;

@Service
public class SithService {

//    public void changeOrderOfSentence(){
//        String sentence[] = "This is my example sentence.".split(" ");
//        String sentenceResult = reverse(sentence);
//    }

    public String reverse(String[] sentence) {
        String result = "";

        for (int i = sentence.length - 1; i >= 0 ; i--) {
            result = result + sentence[i] + " ";
        }
        return result;
    }
}
