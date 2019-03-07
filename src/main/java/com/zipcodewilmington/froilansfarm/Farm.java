package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.products.Horse;
import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Shelter;
import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Vehicle;
import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.products.Chicken;
import com.zipcodewilmington.froilansfarm.products.CropRow;

import java.util.List;

public class Farm {

    private Shelter<CropRow> field;
    private List<Shelter<Horse>> stables;
    private List<Shelter<Chicken>> chickenCoops;
    private Shelter<Person> farmhouse;
    private List<Vehicle> vehicles;



}
