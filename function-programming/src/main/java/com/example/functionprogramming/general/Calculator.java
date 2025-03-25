package com.example.functionprogramming.general;

import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorInterface {

    private Calculator() {
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int addOne(int num) {
        return num + 1;
    }

    public int getFive() {
        return 5;
    }

    public int getTen() {
        return 10;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int subtractOne(int num) {
        return num - 1;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public float divide(int num1, int num2) {
        return (float) num1 / num2;
    }

    public float divideByTwo(int num) {
        return (float) num / 2;
    }
}
