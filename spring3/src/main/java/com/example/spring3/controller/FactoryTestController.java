package com.example.spring3.controller;

import com.example.spring3.util.Animal;
import com.example.spring3.util.designpattern.factory.AnimalService;
import com.example.spring3.util.designpattern.factory.AnimalFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryTestController {

    @GetMapping("factory/{type}")
    public void factoryTestApi(@PathVariable String type) {
        AnimalFactory factory = new AnimalFactory();
        AnimalService cat = factory.getAnimal(Animal.valueOf(type.toUpperCase()));
        cat.eat();
        cat.sound();
    }
}
