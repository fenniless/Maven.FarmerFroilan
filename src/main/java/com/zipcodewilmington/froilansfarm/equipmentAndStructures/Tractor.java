package com.zipcodewilmington.froilansfarm.equipmentAndStructures;

import com.zipcodewilmington.froilansfarm.person.Edible;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.products.Crop;
import com.zipcodewilmington.froilansfarm.products.CropRow;
import com.zipcodewilmington.froilansfarm.products.EarCorn;
import com.zipcodewilmington.froilansfarm.products.Tomato;

import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {

    private Tomato tomato;
    private EarCorn earCorn;
    private List<Crop> cropRow;

    public Edible harvest(CropRow cropRow) {

        return null;
    }

    public void operate(Farm farm) {

    }
}
