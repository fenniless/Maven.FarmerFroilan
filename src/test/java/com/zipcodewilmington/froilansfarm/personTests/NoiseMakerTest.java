package com.zipcodewilmington.froilansfarm.personTests;

import com.zipcodewilmington.froilansfarm.person.Person;
import org.junit.Assert;
import org.junit.Test;

public class NoiseMakerTest {

    @Test
    public void makeNoiseTest() {
        // Given
        Person person = new Person();
        String expected = "Hello";

        // When
        String actual = person.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
