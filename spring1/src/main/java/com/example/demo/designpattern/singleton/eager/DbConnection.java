package com.example.demo.designpattern.singleton.eager;

import com.example.demo.di.Tire;

import java.util.ArrayList;
import java.util.List;

public class DbConnection {

    private static final DbConnection instance = new DbConnection();

    private static final List<Tire> tires = new ArrayList<>();

    private DbConnection() {

    }

    public static DbConnection getInstance() {
        return instance;
    }


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
