package com.greenfoxacademy.programmerfoxclub.model;

public enum Tricks {
    ONE {
        @Override
        public String toString() {
            return "write HTML";
        }
    },

    TWO {
        @Override
        public String toString() {
            return "code in Java";
        }
    }
}
