package com.zipcodewilmington.froilansfarm.personTests;

import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Aircraft;
import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void constructorTest() {
        // Given
        Person expected = new Person();

        // When
        Pilot pilot = new Pilot(expected);
        Person actual = (Person)pilot.getCore();
        boolean inAir = pilot.getAirborne();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertFalse(inAir);
    }

    @Test
    public void flyTest() {
        // Given
        Pilot pilot = new Pilot(new Person());

        // When
        pilot.fly(new Aircraft());
        boolean airborne = pilot.getAirborne();

        // Then
        Assert.assertTrue(airborne);
    }

    @Test
    public void landTest() {
        // Given
        Pilot pilot = new Pilot(new Person());
        Aircraft aircraft = new Aircraft();
        pilot.fly(aircraft);

        // When
        pilot.land(aircraft);
        boolean airborne = pilot.getAirborne();

        // Then
        Assert.assertFalse(airborne);
    }

}
