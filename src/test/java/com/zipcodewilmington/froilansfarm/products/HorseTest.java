package com.zipcodewilmington.froilansfarm.products;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class HorseTest {

    @Test
    public void makeNoise() {
        //Given
        Horse horsey = new Horse();
        String expected = "neigh";

        //When
        String actual = horsey.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ride() {
        //Given
        Horse horsey = new Horse();

        //When
        horsey.ride();
    }
}