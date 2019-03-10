package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Shelter;
import com.zipcodewilmington.froilansfarm.products.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {

    }

    public CropRow<Crop> createCornRow() {
        List<Crop> cornstalks = new ArrayList<Crop>();
        for (int i = 0; i < 20; i++) {
            cornstalks.add(new Crop<EarCorn>());
        }
        return new CropRow(cornstalks);
    }

    public CropRow<Crop> createTomatoRow() {
        List<Crop> tomatoPlants = new ArrayList<Crop>();
        for (int i = 0; i < 30; i++) {
            tomatoPlants.add(new Crop<Tomato>());
        }
        return new CropRow(tomatoPlants);
    }

    public CropRow<Crop> createArbVegRow() {
        List<Crop> arbVeg = new ArrayList<Crop>();
        for (int i = 0; i < 10; i++) {
            arbVeg.add(new Crop<EarCorn>());
        }
        for (int i = 0; i < 15; i++) {
            arbVeg.add(new Crop<Tomato>());
        }
        return new CropRow(arbVeg);
    }

    public Shelter<CropRow> createField() {
        Shelter<CropRow> field = new Shelter<CropRow>();
        field.add(createCornRow());
        field.add(createTomatoRow());
        field.add(createArbVegRow());
        field.add(createArbVegRow());
        field.add(createArbVegRow());
        return field;
    }

    public Shelter<Chicken> createChickenCoop(int numberOfChickens){
        Shelter<Chicken> chickenCoop = new Shelter<Chicken>();
        for (int i = 0; i < numberOfChickens; i++) {
            chickenCoop.add(new Chicken());
        }
        return chickenCoop;
    }

    public List<Shelter<Chicken>> createFroilansChixCoops() {
        List<Shelter<Chicken>> froilansCoops = new ArrayList<Shelter<Chicken>>();
        for (int i = 0; i < 3; i++) {
            froilansCoops.add(createChickenCoop(4));

        }
        froilansCoops.add(createChickenCoop(3));
        return froilansCoops;
    }

    public Shelter<Horse> createStable(int numberOfHorses) {
        Shelter<Horse> stable = new Shelter<Horse>();
        for (int i = 0; i < numberOfHorses; i++) {
            stable.add(new Horse());
        }
        return stable;
    }
}

