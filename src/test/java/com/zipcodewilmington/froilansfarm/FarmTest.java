package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Shelter;
import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Tractor;
import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Vehicle;
import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.person.Personable;
import com.zipcodewilmington.froilansfarm.products.Chicken;
import com.zipcodewilmington.froilansfarm.products.Crop;
import com.zipcodewilmington.froilansfarm.products.CropRow;
import com.zipcodewilmington.froilansfarm.products.Horse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FarmTest {

    @Test
    void getField() {
        // Given
        Shelter<CropRow> expected = new Shelter<CropRow>();
        expected.add(new CropRow(new ArrayList<Crop>()));
        Farm farm = new Farm(expected, null, null, null, null);

        // When
        Shelter<CropRow> actual = farm.getField();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getStables() {
        // Given
        Shelter<Horse> stable = new Shelter<Horse>();
        stable.add(new Horse());
        stable.add(new Horse());
        List<Shelter<Horse>> expected = new ArrayList<Shelter<Horse>>();
        expected.add(stable);
        Farm farm = new Farm(null, expected, null, null, null);

        // When
        List<Shelter<Horse>> actual = farm.getStables();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getChickenCoops() {
        // Given
        Shelter<Chicken> chickenCoop = new Shelter<Chicken>();
        chickenCoop.add(new Chicken());
        List<Shelter<Chicken>> expected = new ArrayList<Shelter<Chicken>>();
        expected.add(chickenCoop);
        Farm farm = new Farm(null, null, expected, null, null);

        // When
        List<Shelter<Chicken>> actual = farm.getChickenCoops();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getFarmhouse() {
        // Given
        Shelter<Personable> expected = new Shelter<Personable>();
        expected.add(new Person());
        Farm farm = new Farm(null, null, null, expected, null);

        // When
        Shelter<Personable> actual = farm.getFarmhouse();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getVehicles() {
        // Given
        List<Vehicle> expected = new ArrayList<Vehicle>();
        expected.add(new Tractor());
        Farm farm = new Farm(null, null, null, null, expected);

        // When
        List<Vehicle> actual = farm.getVehicles();

        // Then
        Assert.assertEquals(expected, actual);
    }
}