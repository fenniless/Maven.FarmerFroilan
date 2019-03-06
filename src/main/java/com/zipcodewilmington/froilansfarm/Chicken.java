package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {


    public EdibleEgg yield() {

        return new EdibleEgg();
    }
}
