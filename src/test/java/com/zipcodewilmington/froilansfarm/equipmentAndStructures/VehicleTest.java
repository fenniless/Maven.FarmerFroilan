package com.zipcodewilmington.froilansfarm.equipmentAndStructures;
import com.zipcodewilmington.froilansfarm.person.NoiseMaker;
import com.zipcodewilmington.froilansfarm.person.Rideable;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void inheritanceTest(){
        Vehicle vehicle = new Vehicle();

        Assert.assertTrue(vehicle instanceof NoiseMaker);
    }

    @Test
    public void inheritanceTest2(){
        Vehicle vehicle = new Vehicle();

        Assert.assertTrue(vehicle instanceof Rideable);
    }

    @Test
    public void makeNoise() {
        Vehicle vehicle = new Vehicle();
        String actual =
        vehicle.makeNoise();

        Assert.assertEquals("Vroooomm!", actual);
    }

    @Test
    public void ride() {
        Vehicle vehicle = new Vehicle();
        vehicle.ride();
    }
}
