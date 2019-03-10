package com.zipcodewilmington.froilansfarm.person;

public class Person implements Personable, NoiseMaker, Eater {

    private int calories;

    public Person() {
        this.calories = 0;
    }

    public String makeNoise() {
        return "Hello";
    }

    public void eat(Edible edible) {
        calories += 100;
    }

    public int getCalories() {
        return calories;
    }
}
