package com.example.functionprogramming.util;

public class FunctionalProgrammingMethods {

    private int number;

    // Good to function programming
    public int add(int a, int b) {
        return a + b;
    }

    // This function is not good
    public void addOne() {
        this.number += 1;
    }

    // Good function
    public int addOne(int number) {
        return number + 1;
    }

    public int sum(int a, int b) {
        if (a > b) {
            return a + b;
        } else {
            return a + b + 10;
        }
    }
}
