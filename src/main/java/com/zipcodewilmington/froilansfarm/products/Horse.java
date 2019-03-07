package com.zipcodewilmington.froilansfarm.products;

import com.zipcodewilmington.froilansfarm.person.Rideable;
import com.zipcodewilmington.froilansfarm.products.Animal;

public class Horse extends Animal implements Rideable {

    public String makeNoise(){
        return "neeigh";
    }
    public void ride() {
    }
}
