package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class CropRow<T extends Crop> {

    private List<T> crops;

    public CropRow(List<T> crops) {
        this.crops = crops;
    }
}
