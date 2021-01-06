package com.greenfoxacademy.springstart.model;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    Long greetCount;
    String content;
    static AtomicLong atomicLong = new AtomicLong();



    public Greeting(String content) {
        this.greetCount = 0L;
        this.content = content;
    }

    public Long getGreetCount(){
        return atomicLong.getAndIncrement();
    }


    public String getContent() {
        return content;
    }
}
