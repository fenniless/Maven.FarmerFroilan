package com.zipcodewilmington.froilansfarm.products;

import com.zipcodewilmington.froilansfarm.person.Edible;

public class Crop<T extends Edible> implements Produce{

    private Boolean hasBeenHarvested;
    private Boolean hasBeenFertilized;

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public EdibleEgg yield() {
        return null;
    }
}
