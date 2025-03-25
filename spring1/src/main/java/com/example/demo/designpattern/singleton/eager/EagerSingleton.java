package com.example.demo.designpattern.singleton.eager;

public class EagerSingleton {

    // Eager Initialization
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void printMessage() {
        System.out.println("EagerSingleton");
    }

    public void printMessage2() {
        System.out.println("EagerSingleton2");
    }
}
