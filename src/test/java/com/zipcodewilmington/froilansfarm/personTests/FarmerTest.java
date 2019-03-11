package com.zipcodewilmington.froilansfarm.personTests;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmBuilder;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Person;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void constructorTest() {
        // Given
        Farm expected = new FarmBuilder().createFarm();

        // When
        Farmer farmer = new Farmer(new Person());

        // Then
        Assert.assertTrue(farmer != null);
    }
}
