package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.products.Crop;
import com.zipcodewilmington.froilansfarm.products.CropRow;

public class Botanist extends PersonDecorator {

    private Personable core;

    public Botanist(Personable inner) {
        core = inner;
    }

    public void plants(Crop crop, CropRow cropRow){

    }

    public Personable getCore() {
        return core;
    }
}
