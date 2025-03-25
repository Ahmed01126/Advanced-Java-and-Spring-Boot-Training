package com.example.demo.controller;

import com.example.demo.di.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
public class CarController {

    private final Car car;

    @Autowired
    public CarController(Car car) {
        this.car = car;
    }

    @GetMapping("startEngine")
    public Car getCar() {
        car.startEngine();
        car.drive();

        System.out.println(car);

        car.getTire().setSize(16);
        car.setBrand("BMW");
        car.setColor("Black");
        car.setModel("ABC");

        System.out.println(car);

        return car;
    }
}
