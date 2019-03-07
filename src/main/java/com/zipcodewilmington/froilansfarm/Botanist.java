package com.zipcodewilmington.froilansfarm;

public class Botanist extends FarmerDecorator {

    private Farming core;

    public Botanist(Farming inner) {
        core = inner;
    }

    void plants(Crop crop, CropRow cropRow);
}
