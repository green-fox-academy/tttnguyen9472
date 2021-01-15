package com.greenfoxacademy.programmerfoxclub.model;

public enum Drink {

    A {
        @Override
        public String toString() {
            return "cola";
        }
    },

    B {
        @Override
        public String toString() {
            return "red bull";
        }
    },

    C {
        @Override
        public String toString() {
            return "whisky 🥃";
        }
    },

    D {
        @Override
        public String toString() {
            return "sake 🍶";
        }
    },

    E {
        @Override
        public String toString() {
            return "breast milk 🍼";
        }
    },

    F {
        @Override
        public String toString() {
            return "milk 🥛";
        }
    },

    G {
        @Override
        public String toString() {
            return "beer 🍺";
        }
    },

    H {
        @Override
        public String toString() {
            return "juice 🧃";
        }
    },

    I {
        @Override
        public String toString() {
            return "soda 🥤";
        }
    },

    J {
        @Override
        public String toString() {
            return "wine 🍷";
        }
    },

    K {
        @Override
        public String toString() {
            return "cocktail 🍸";
        }
    },

    L {
        @Override
        public String toString() {
            return "long drink 🍹";
        }
    },

    M {
        @Override
        public String toString() {
            return "coffee ☕️";
        }
    },

    N {
        @Override
        public String toString() {
            return "tea 🍵";
        }
    },

    O {
        @Override
        public String toString() {
            return "champagne 🍾";
        }
    }
}
