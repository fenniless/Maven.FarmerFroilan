package com.zipcodewilmington.froilansfarm.equipmentAndStructures;

import com.zipcodewilmington.froilansfarm.person.NoiseMaker;
import com.zipcodewilmington.froilansfarm.person.Rideable;

public class Vehicle implements NoiseMaker, Rideable {
    public String makeNoise() {
        return "Vroooomm!";
    }

    public void ride() {

    }
}
