package com.example.demo.designpattern.singleton.billpugh;

import com.example.demo.di.Tire;

import java.util.ArrayList;
import java.util.List;

public class DbConnection {

    private final List<Tire> tires;

    private DbConnection() {
        tires = new ArrayList<>();
    }


    public static class DbConnectionHelper {
        private static final DbConnection INSTANCE = new DbConnection();
    }

    public static DbConnection getInstance() {
        return DbConnectionHelper.INSTANCE;
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
