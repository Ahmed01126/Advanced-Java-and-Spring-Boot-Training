package com.example.demo.controller;

import com.example.demo.designpattern.singleton.enumsingleton.DbConnection;
import com.example.demo.di.Tire;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SingletonController {


    @GetMapping("saveTire1")
    public void saveTire1Api() {
        Tire tire = new Tire();
        tire.setSize(16);

        DbConnection dbConnection = DbConnection.INSTANCE;
        dbConnection.save(tire);
    }

    @GetMapping("saveTire2")
    public void saveTire2Api() {
        Tire tire = new Tire();
        tire.setSize(14);

        DbConnection dbConnection = DbConnection.INSTANCE;

        dbConnection.save(tire);
    }

    @GetMapping("findAll")
    public List<Tire> getTiresApi() {

        DbConnection dbConnection = DbConnection.INSTANCE;

        return dbConnection.findAll();
    }


}
