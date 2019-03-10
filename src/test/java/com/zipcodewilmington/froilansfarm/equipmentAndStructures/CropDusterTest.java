package com.zipcodewilmington.froilansfarm.equipmentAndStructures;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.products.Crop;
import com.zipcodewilmington.froilansfarm.products.CropRow;
import com.zipcodewilmington.froilansfarm.products.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void inheritanceTest(){
        CropDuster cropDuster = new CropDuster();

        Assert.assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    public void inheritanceTest2(){
        CropDuster cropDuster = new CropDuster();

        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }

    @Test
    public void operate() {
        CropDuster cropDuster = new CropDuster();
        Farm farm = new Farm();
        cropDuster.operate(farm);

    }

    @Test
    public void fertilize() {
        CropDuster cropDuster = new CropDuster();
        Crop crop = new Crop();
        List<Crop> crops = new ArrayList<Crop>();
        CropRow cropRow = new CropRow(crops);

        cropDuster.fertilize(cropRow);
    }
}