package com.example.spring3.util.designpattern.factory;

public class Dog implements AnimalService {
    @Override
    public void eat() {
        System.out.println("3m 3m 3m 3m 3m");
    }

    @Override
    public void sound() {
        System.out.println("Hw hw hw");
    }
}
