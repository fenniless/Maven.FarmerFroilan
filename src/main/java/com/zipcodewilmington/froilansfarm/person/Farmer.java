package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.products.Crop;
import com.zipcodewilmington.froilansfarm.products.CropRow;

public class Farmer extends PersonDecorator {

    private Personable core;

    private Farm farm;

    public Farmer(Personable inner, Farm farm) {
        this.farm = farm;
        this.core = inner;
    }

    public Farm getFarm() {
        return farm;
    }
}
