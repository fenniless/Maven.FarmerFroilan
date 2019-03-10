package com.zipcodewilmington.froilansfarm.equipmentAndStructures;

import java.util.ArrayList;
import java.util.List;

public class Shelter<T> {

    private List<T> list;

    public Shelter() {
        this.list = new ArrayList<T>();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T obj) {
        list.add(obj);
    }

}
