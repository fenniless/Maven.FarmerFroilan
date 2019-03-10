package com.zipcodewilmington.froilansfarm.personTests;

import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.person.Rider;
import org.junit.Assert;
import org.junit.Test;

public class RiderTest {

    @Test
    public void constructorTest() {
        // Given
        Person expected = new Person();

        // When
        Rider rider = new Rider(expected);
        Person actual = (Person)rider.getCore();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
