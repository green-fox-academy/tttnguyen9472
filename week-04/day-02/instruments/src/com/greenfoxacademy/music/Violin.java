package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{
    public Violin(){
        this.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play() {
        sound();
    }

    @Override
    public void sound() {
        System.out.println("Violin, a " + numberOfStrings + "-stringed instrument that goes Screech");
    }
}
