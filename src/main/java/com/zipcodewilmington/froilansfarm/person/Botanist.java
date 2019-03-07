package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.products.Crop;
import com.zipcodewilmington.froilansfarm.products.CropRow;

public class Botanist extends FarmerDecorator {

    private Farming core;

    public Botanist(Farming inner) {
        core = inner;
    }

    public void plants(Crop crop, CropRow cropRow){

    }
}
