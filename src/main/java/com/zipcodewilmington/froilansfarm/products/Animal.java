package com.zipcodewilmington.froilansfarm.products;

import com.zipcodewilmington.froilansfarm.person.Eater;
import com.zipcodewilmington.froilansfarm.person.Edible;
import com.zipcodewilmington.froilansfarm.person.NoiseMaker;

public abstract class Animal implements Eater, NoiseMaker {


    public String makeNoise() {
        return null;
    }

    public void eat(Edible edible) {

    }
}
