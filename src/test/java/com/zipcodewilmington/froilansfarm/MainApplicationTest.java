package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Shelter;
import com.zipcodewilmington.froilansfarm.products.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    MainApplication main = new MainApplication();

    @Test
    public void createCornRowTest() {
        // Given
        int expected = 20;

        // When
        List<Crop> cornstalks = main.createCornRow().getCrops();
        int actual = cornstalks.size();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(cornstalks.get(0) instanceof Crop);
    }

    @Test
    public void createTomatoRowTest() {
        // Given
        int expected = 30;

        // When
        List<Crop> tomatoPlants = main.createTomatoRow().getCrops();
        int actual = tomatoPlants.size();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(tomatoPlants.get(0) instanceof Crop);
    }

    @Test
    public void createArbVegRow() {
        // Given
        int expected = 25;

        // When
        List<Crop> arbVeg = main.createArbVegRow().getCrops();
        int actual = arbVeg.size();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(arbVeg.get(0) instanceof Crop);
    }

    @Test
    public void createFieldTest() {
        // Given
        int expected = 5;

        // When
        Shelter<CropRow> field = main.createField();
        List<CropRow> cropRows = field.getList();
        int actual = cropRows.size();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(cropRows.get(0) instanceof CropRow);
    }

    @Test
    public void createChickenCoopThreeChixTest() {
        // Given
        int expected = 3;

        // When
        Shelter<Chicken> chickenCoop = main.createChickenCoop(expected);
        List<Chicken> chickens = chickenCoop.getList();
        int actual = chickens.size();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(chickens.get(0) instanceof Chicken);
    }

    @Test
    public void createChickenCoopFiveChixTest() {
        // Given
        int expected = 5;

        // When
        Shelter<Chicken> chickenCoop = main.createChickenCoop(expected);
        List<Chicken> chickens = chickenCoop.getList();
        int actual = chickens.size();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(chickens.get(0) instanceof Chicken);
    }

    @Test
    public void createFroilansChixCoopsTest() {
        // Given
        int expected = 4;

        // When
        List<Shelter<Chicken>> froilansCoops = main.createFroilansChixCoops();
        int actual = froilansCoops.size();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(froilansCoops.get(0) instanceof Shelter);
    }

    @Test
    public void createStableTest() {
        // Given
        int expected = 6;

        // When
        Shelter<Horse> stable = main.createStable(expected);
        List<Horse> horses = stable.getList();
        int actual = horses.size();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(horses.get(0) instanceof Horse);
    }
}
