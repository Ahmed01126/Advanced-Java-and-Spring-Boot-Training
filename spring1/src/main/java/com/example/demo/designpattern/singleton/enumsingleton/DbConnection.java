package com.example.demo.designpattern.singleton.enumsingleton;

import com.example.demo.di.Tire;

import java.util.ArrayList;
import java.util.List;

public enum DbConnection {
    INSTANCE;

    private final List<Tire> tires = new ArrayList<>();

    public void save(Tire tire) {
        tires.add(tire);
    }

    public void clear() {
        tires.clear();
    }

    public List<Tire> findAll() {
        return tires;
    }
}
