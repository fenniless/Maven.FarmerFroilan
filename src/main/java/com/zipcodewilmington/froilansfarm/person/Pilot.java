package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Vehicle;

public class Pilot extends FarmerDecorator {

    private Farming core;

    public Pilot(Farming inner) {
        core = inner;
    }

    public void fly(Vehicle vehicle) {

    }

}
