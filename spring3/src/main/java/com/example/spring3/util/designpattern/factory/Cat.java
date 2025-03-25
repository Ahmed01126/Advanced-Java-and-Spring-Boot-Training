package com.example.spring3.util.designpattern.factory;

public class Cat implements AnimalService {
    @Override
    public void eat() {
        System.out.println("Hmhmhmhm");
    }

    @Override
    public void sound() {
        System.out.println("neao neao neao");
    }
}
