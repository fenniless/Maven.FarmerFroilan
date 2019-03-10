package com.zipcodewilmington.froilansfarm.personTests;

import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.products.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class EaterTest {

    @Test
    public void eatTest() {
        // Given
        Tomato tomato = new Tomato();
        Person person = new Person();
        int expected = person.getCalories() + 100;

        // When
        person.eat(tomato);
        int actual = person.getCalories();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
