package com.zipcodewilmington.froilansfarm.products;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;

    public EdibleEgg yield() {
        if (!hasBeenFertilized) {
            return new EdibleEgg();
        }
        return null;
    }
    public String makeNoise() {
       return "Bawk! Bawk! Bawk!";
    }
}
