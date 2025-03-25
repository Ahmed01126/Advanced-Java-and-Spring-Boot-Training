package com.example.functionprogramming.general;

public interface CalculatorInterface {

    /**
     * Accepts two numbers and returns the sum.
     *
     * @param num1 first number to be added
     * @param num2 second number to be added
     * @return summation of num1 and num2
     */
    int add(int num1, int num2);

    int addOne(int num);

    int getFive();

    int getTen();

    /**
     * Accepts two numbers and returns the subtraction.
     *
     * @param num1 first number to be added
     * @param num2 second number to be added
     * @return subtraction of num1 and num2
     */
    int subtract(int num1, int num2);

    int subtractOne(int num);

    int multiply(int num1, int num2);

    float divide(int num1, int num2);

    float divideByTwo(int num);
}
