package com.zipcodewilmington.froilansfarm;

public class Pilot extends FarmerDecorator {

    private Farming core;

    public Pilot(Farming inner) {
        core = inner;
    }

    public void fly(Vehicle vehicle) {

    }

}
