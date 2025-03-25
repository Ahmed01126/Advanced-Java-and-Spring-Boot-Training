package com.example.demo.designpattern.singleton.eager;

import com.example.demo.di.Tire;

public class Test {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.printMessage();
        eagerSingleton.printMessage2();

        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        eagerSingleton2.printMessage();
        eagerSingleton2.printMessage2();


        DbConnection dbConnection = DbConnection.getInstance();
        dbConnection.save(new Tire());




    }
}
