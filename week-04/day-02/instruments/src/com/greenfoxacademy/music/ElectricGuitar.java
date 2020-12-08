package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(){
        this.numberOfStrings = 6;
    }
    public ElectricGuitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        sound();
    }

    @Override
    public void sound() {
        System.out.println("Electric Guitar, a " + numberOfStrings + "-stringed instrument that goes Twang");
    }
}
