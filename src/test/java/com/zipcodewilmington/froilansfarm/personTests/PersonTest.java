package com.zipcodewilmington.froilansfarm.personTests;

import com.zipcodewilmington.froilansfarm.person.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void constructorTest() {
        // Given
        int expected = 0;

        // When
        Person person = new Person();
        int actual = person.getCalories();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
