package com.zipcodewilmington.froilansfarm.products;

import org.junit.Assert;
import org.junit.Test;


public class ChickenTest {

    @Test
    public void yield() {
        //Given
        Chicken chickadee = new Chicken();
        EdibleEgg actual = new EdibleEgg();

        //When
        EdibleEgg expected = chickadee.yield();

        //Then
        Assert.assertEquals(actual, expected);

    }



    @Test
    public void makeNoise() {
        //Given
        Chicken chickadee = new Chicken();
        String expected = "Bawk! Bawk! Bawk!";

        //When
        String actual = chickadee.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);

    }
}