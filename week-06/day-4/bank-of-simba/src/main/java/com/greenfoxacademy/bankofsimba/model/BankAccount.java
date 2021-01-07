package com.greenfoxacademy.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private boolean isKing;

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    private static DecimalFormat df2 = new DecimalFormat("#.00");

    public BankAccount(String name, Double balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getFormattedBalance() {
        return df2.format(balance).toString() + " Zebra";
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getStyle(){
        if(isKing){
            return "king";
        }
        return "notKing";
    }
}
