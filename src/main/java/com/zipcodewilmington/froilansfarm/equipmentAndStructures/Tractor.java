package com.zipcodewilmington.froilansfarm.equipmentAndStructures;

import com.zipcodewilmington.froilansfarm.person.Edible;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.products.Crop;
import com.zipcodewilmington.froilansfarm.products.CropRow;

public class Tractor extends Vehicle implements FarmVehicle {

    public Edible harvest(Crop crop, CropRow cropRow) {
        return null;
    }

    public void operate(Farm farm) {

    }
}
