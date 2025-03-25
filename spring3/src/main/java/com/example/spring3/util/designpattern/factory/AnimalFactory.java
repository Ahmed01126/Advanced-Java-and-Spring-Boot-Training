package com.example.spring3.util.designpattern.factory;

import com.example.spring3.util.Animal;
import com.example.spring3.util.Country;

public class AnimalFactory {

    public AnimalService getAnimal(Animal type) {
        switch (type) {
            case DOG:
                return new Dog();
            case CAT:
                return new Cat();
            case LION:
                return new Lion();
            default:
                return null;
        }
    }

    public String getCountry(Country type) {
        return switch (type) {
            case EGYPT -> Country.EGYPT.name();
            case JORDAN -> Country.JORDAN.name();
            default -> null;
        };
    }
}
