package com.zipcodewilmington.froilansfarm.equipmentAndStructures;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.person.NoiseMaker;
import com.zipcodewilmington.froilansfarm.person.Rideable;
import com.zipcodewilmington.froilansfarm.products.Crop;
import com.zipcodewilmington.froilansfarm.products.CropRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TractorTest {


    @Test
    public void inheritanceTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof NoiseMaker);
    }
    @Test
    public void inheritanceTest2(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Rideable);
    }
    @Test
    public void inheritanceTest3(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Vehicle);
    }
    @Test
    public void inheritanceTest4(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void harvest() {
        Tractor tractor = new Tractor();
        Crop crop = new Crop();
        List<Crop> crops = new ArrayList<Crop>();
        CropRow cropRow = new CropRow(crops);

        Assert.assertNull(tractor.harvest(cropRow));
    }

    @Test
    public void operate() {
        Tractor tractor = new Tractor();
        Farm farm = new Farm();
        tractor.operate(farm);
    }
}