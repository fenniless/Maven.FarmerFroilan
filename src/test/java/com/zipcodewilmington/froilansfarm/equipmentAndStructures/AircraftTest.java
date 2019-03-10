package com.zipcodewilmington.froilansfarm.equipmentAndStructures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AircraftTest {

    @Test
    public void inheritanceTest(){
        Aircraft aircraft = new Aircraft();
        Assert.assertTrue(aircraft instanceof Vehicle);
    }
    @Test
    public void fly() {
        Aircraft aircraft = new Aircraft();

        aircraft.fly();
    }
}