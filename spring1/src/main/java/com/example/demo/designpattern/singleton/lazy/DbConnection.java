package com.example.demo.designpattern.singleton.lazy;

import com.example.demo.di.Tire;

import java.util.ArrayList;
import java.util.List;

public class DbConnection {

    private static DbConnection instance;

    private final List<Tire> tires;

    private DbConnection() {
        tires = new ArrayList<>();
    }

    public static DbConnection getInstance() {
        if (instance == null) {
            synchronized (DbConnection.class) {
                if (instance == null) {
                    instance = new DbConnection();
                }
            }
        }
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
