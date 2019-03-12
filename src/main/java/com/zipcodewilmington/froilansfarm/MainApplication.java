package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.equipmentAndStructures.*;
import com.zipcodewilmington.froilansfarm.person.*;
import com.zipcodewilmington.froilansfarm.products.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

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
        return createShelter(Chicken::new, numberOfChickens);
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
        return createShelter(Horse::new, numberOfHorses);
    }
    private <T> Shelter<T> createShelter(Supplier<T> supplier, int numberOfElements) {
        Shelter<T> shelter = new Shelter<T>();
        for (int i = 0; i < numberOfElements; i++) {
            shelter.add(supplier.get());
        }
        return shelter;
    }

    public List<Shelter<Horse>> createFroilansStables() {
        List<Shelter<Horse>> stables = new ArrayList<Shelter<Horse>>();
        stables.add(createStable(3));
        stables.add(createStable(3));
        stables.add(createStable(4));
        return stables;
    }

    public List<Vehicle> createFroilansVehicles() {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Tractor());
        vehicles.add(new CropDuster());
        vehicles.add(new Aircraft());
        return vehicles;
    }

    public Personable createFroilan() {
        return new Farmer(new Botanist(new Rider(new Person())));
    }

    public Personable createFroilanda() {
        return new Botanist(new Rider(new Pilot(new Person())));
    }

    public Shelter<Personable> createFroilansFarmhouse() {
        Shelter<Personable> farmhouse = new Shelter<Personable>();
        farmhouse.add(createFroilan());
        farmhouse.add(createFroilanda());
        return farmhouse;
    }

    public Farm setUpFroilansFarm() {
        FarmBuilder farmBuilder = new FarmBuilder();
        farmBuilder.setField(createField());
        farmBuilder.setChickenCoops(createFroilansChixCoops());
        farmBuilder.setStables(createFroilansStables());
        farmBuilder.setFarmhouse(createFroilansFarmhouse());
        farmBuilder.setVehicles(createFroilansVehicles());
        return farmBuilder.createFarm();
    }

}

