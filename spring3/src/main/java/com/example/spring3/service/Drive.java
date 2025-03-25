package com.example.spring3.service;

import org.springframework.stereotype.Component;

@Component
public class Drive {

    public void startEngine() {
        System.out.println("3n3n3n3n3n3n3nnnnnnn3nn3n3n3n3n3nn3n");
    }

    public void stopEngine() {
        System.out.println("Engine is stopped.");
    }

    public void turnRight() {
        System.out.println("Turning right.");
    }

    public void turnLeft() {
        System.out.println("Turning left.");
    }
}
