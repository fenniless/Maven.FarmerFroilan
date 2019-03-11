package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.person.Personable;
import com.zipcodewilmington.froilansfarm.products.Horse;
import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Shelter;
import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Vehicle;
import com.zipcodewilmington.froilansfarm.products.Chicken;
import com.zipcodewilmington.froilansfarm.products.CropRow;

import java.util.List;

public class Farm {

    private Shelter<CropRow> field;
    private List<Shelter<Horse>> stables;
    private List<Shelter<Chicken>> chickenCoops;
    private Shelter<Personable> farmhouse;
    private List<Vehicle> vehicles;

    public Farm(Shelter<CropRow> field, List<Shelter<Horse>> stables, List<Shelter<Chicken>> chickenCoops, Shelter<Personable> farmhouse, List<Vehicle> vehicles) {
        this.field = field;
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmhouse = farmhouse;
        this.vehicles = vehicles;
    }

    public Shelter<CropRow> getField() {
        return field;
    }

    public List<Shelter<Horse>> getStables() {
        return stables;
    }

    public List<Shelter<Chicken>> getChickenCoops() {
        return chickenCoops;
    }

    public Shelter<Personable> getFarmhouse() {
        return farmhouse;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
