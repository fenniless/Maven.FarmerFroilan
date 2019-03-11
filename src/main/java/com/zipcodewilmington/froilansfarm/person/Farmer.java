package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.products.Crop;
import com.zipcodewilmington.froilansfarm.products.CropRow;

public class Farmer extends PersonDecorator {

    private Personable core;

    public Farmer(Personable inner) {
        this.core = inner;
    }

}
