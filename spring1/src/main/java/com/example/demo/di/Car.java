package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Car {
    private String brand;
    private String model;
    private String color;

    private Tire tire;

    @Autowired
    public Car(Tire tire) {
        this.tire = tire;
    }

    public void startEngine() {
        System.out.println("3n3n3n3n3n3n3n3n3n3n3n3n3n3n3n3n3n3nnnnnnnnnnnnnnnnnnnnnn");
    }

    public void drive() {
        System.out.println("Vooooooovoooooovoovooovooooooo");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(tire, car.tire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, tire);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", tire=" + tire +
                '}';
    }
}
