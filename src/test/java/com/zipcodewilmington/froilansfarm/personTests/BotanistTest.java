package com.zipcodewilmington.froilansfarm.personTests;

import com.zipcodewilmington.froilansfarm.person.Botanist;
import com.zipcodewilmington.froilansfarm.person.Person;
import org.junit.Assert;
import org.junit.Test;

public class BotanistTest {

    @Test
    public void constructorTest() {
        // Given
        Person expected = new Person();

        // When
        Botanist botanist = new Botanist(expected);
        Person actual = (Person)botanist.getCore();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
