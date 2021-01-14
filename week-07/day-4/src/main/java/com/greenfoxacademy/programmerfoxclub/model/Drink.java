package com.greenfoxacademy.programmerfoxclub.model;

public enum Drink {

    ONE {
        @Override
        public String toString() {
            return "cola";
        }
    },

    TWO {
        @Override
        public String toString() {
            return "red bull";
        }
    }
}
