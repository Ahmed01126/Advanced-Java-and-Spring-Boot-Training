package com.example.spring3.util.designpattern.factory;

import com.example.spring3.util.Animal;

public class TestFactory {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        AnimalService cat = factory.getAnimal(Animal.CAT);
        cat.eat();
        cat.sound();

    }
}
