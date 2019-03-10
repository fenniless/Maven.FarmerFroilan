package com.zipcodewilmington.froilansfarm.products;

import java.util.List;

public class CropRow<T extends Crop> {

    private List<T> crops;

    public CropRow(List<T> crops) {
        this.crops = crops;
    }

    public List<T> getCrops() {
        return crops;
    }
}
