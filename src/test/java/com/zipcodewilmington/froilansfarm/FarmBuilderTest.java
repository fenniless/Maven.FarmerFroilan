package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Shelter;
import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Vehicle;
import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.products.Chicken;
import com.zipcodewilmington.froilansfarm.products.CropRow;
import com.zipcodewilmington.froilansfarm.products.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FarmBuilderTest {

    @Test
    public void setFieldTest() {
        Shelter<CropRow> field = new Shelter<CropRow>();
        FarmBuilder fieldFarm =  new FarmBuilder().setField(field);
        Assert.assertEquals(field, fieldFarm.getField());
    }

    @Test
    public void setStablesTest() {
        List<Shelter<Horse>> stables = new ArrayList<Shelter<Horse>>();
        FarmBuilder horseFarm = new FarmBuilder().setStables(stables);
        Assert.assertEquals(stables,horseFarm.getStables());
    }

    @Test
    public void setChickenCoopsTest() {
        List<Shelter<Chicken>> chickenCoops = new ArrayList<Shelter<Chicken>>();
        FarmBuilder chickenFarm = new FarmBuilder().setChickenCoops(chickenCoops);
        Assert.assertEquals(chickenCoops, chickenFarm.getChickenCoops());
    }

    @Test
    public void setFarmhouseTest() {
        Shelter<Person> farmhouse = new Shelter<Person>();
        FarmBuilder personFarm = new FarmBuilder().setFarmhouse(farmhouse);
        Assert.assertEquals(farmhouse,personFarm.getFarmhouse());
    }

    @Test
    public void setVehiclesTest() {
        List<Vehicle> garage = new ArrayList<Vehicle>();
        FarmBuilder carFarm = new FarmBuilder().setVehicles(garage);
        Assert.assertEquals(garage, carFarm.getVehicles());
    }

    @Test
    public void createFarmTest() {
        Shelter<CropRow> field = new Shelter<CropRow>();
        List<Shelter<Horse>> stables = new ArrayList<Shelter<Horse>>();
        List<Shelter<Chicken>> chickenCoops = new ArrayList<Shelter<Chicken>>();
        Shelter<Person> farmhouse = new Shelter<Person>();
        List<Vehicle> garage = new ArrayList<Vehicle>();
        FarmBuilder farm = new FarmBuilder().setField(field).setStables(stables).setChickenCoops(chickenCoops)
                .setFarmhouse(farmhouse).setVehicles(garage);
        farm.createFarm();
        Assert.assertNotNull(farm);
    }
}