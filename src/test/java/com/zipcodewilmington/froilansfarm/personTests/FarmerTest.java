package com.zipcodewilmington.froilansfarm.personTests;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Person;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void constructorTest() {
        // Given
        Farm expected = new Farm();

        // When
        Farmer farmer = new Farmer(new Person(), expected);
        Farm actual = farmer.getFarm();

        // Then
        Assert.assertEquals(expected, actual);
    }
}