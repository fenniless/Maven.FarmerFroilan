package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Shelter;
import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Vehicle;
import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.products.Chicken;
import com.zipcodewilmington.froilansfarm.products.CropRow;
import com.zipcodewilmington.froilansfarm.products.Horse;

import java.util.List;

public class FarmBuilder {
    private Shelter<CropRow> field;
    private List<Shelter<Horse>> stables;
    private List<Shelter<Chicken>> chickenCoops;
    private Shelter<Person> farmhouse;
    private List<Vehicle> vehicles;

    public FarmBuilder setField(Shelter<CropRow> field) {
        this.field = field;
        return this;
    }

    public FarmBuilder setStables(List<Shelter<Horse>> stables) {
        this.stables = stables;
        return this;
    }

    public FarmBuilder setChickenCoops(List<Shelter<Chicken>> chickenCoops) {
        this.chickenCoops = chickenCoops;
        return this;
    }

    public FarmBuilder setFarmhouse(Shelter<Person> farmhouse) {
        this.farmhouse = farmhouse;
        return this;
    }

    public FarmBuilder setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public Farm createFarm() {
        return new Farm(field, stables, chickenCoops, farmhouse, vehicles);
    }
}