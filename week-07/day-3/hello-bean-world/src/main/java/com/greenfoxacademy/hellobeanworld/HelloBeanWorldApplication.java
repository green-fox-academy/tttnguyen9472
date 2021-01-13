package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.model.BlueColor;
import com.greenfoxacademy.hellobeanworld.service.MyColor;
import com.greenfoxacademy.hellobeanworld.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor myColor;

    @Autowired
    HelloBeanWorldApplication(Printer printer, MyColor myColor){
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloBeanWorldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(myColor.printColor());

    }
}
