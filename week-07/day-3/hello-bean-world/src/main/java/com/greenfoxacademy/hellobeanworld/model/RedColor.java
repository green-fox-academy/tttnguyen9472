package com.greenfoxacademy.hellobeanworld.model;

import com.greenfoxacademy.hellobeanworld.service.MyColor;
import com.greenfoxacademy.hellobeanworld.service.Printer;

public class RedColor implements MyColor {


    @Override
    public String printColor() {
        return "It is red in color...";
    }
}
