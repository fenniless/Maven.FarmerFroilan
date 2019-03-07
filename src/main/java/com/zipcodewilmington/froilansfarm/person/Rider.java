package com.zipcodewilmington.froilansfarm.person;

public class Rider extends FarmerDecorator{

    private Farming core;

    public Rider(Farming inner) {
        core = inner;
    }

    public void mount(Rideable obj) {

    }

    public void dismount(Rideable obj) {

    }
}
