package com.zipcodewilmington.froilansfarm;

public class Crop<T extends Edible> implements Produce{

    private Boolean hasBeenHarvested;
    private Boolean hasBeenFertilized;

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public T yield() {
        return null;
    }
}
