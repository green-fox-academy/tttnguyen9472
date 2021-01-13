package com.greenfoxacademy.hellobeanworld.model;

import com.greenfoxacademy.hellobeanworld.service.MyColor;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

    @Override
    public String printColor() {
        return "It is blue in color...";
    }
}
