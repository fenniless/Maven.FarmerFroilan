package com.zipcodewilmington.froilansfarm;

public class Botanist extends FarmerDecorator {

    private Farming core;

    public Botanist(Farming inner) {
        core = inner;
    }

    public void plants(Crop crop, CropRow cropRow) {

    }
}
