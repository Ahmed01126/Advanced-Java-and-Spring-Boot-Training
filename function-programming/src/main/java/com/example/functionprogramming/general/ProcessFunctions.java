package com.example.functionprogramming.general;

import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;

public class ProcessFunctions {

    private ProcessFunctions() {
    }

    public static Integer processIntFunction(IntFunction<Integer> function, int number) {
        return function.apply(number);
    }

    public static Float processFloatedIntFunction(IntFunction<Float> function, int number) {
        return function.apply(number);
    }

    public static Integer processToIntBiFunction(ToIntBiFunction<Integer, Integer> function, int number1, int number2) {
        return function.applyAsInt(number1, number2);
    }

    public static Double processFloatedBiFunction(
            ToDoubleBiFunction<Integer, Integer> function, int number1, int number2) {
        return function.applyAsDouble(number1, number2);
    }

    public static int processIntSupplier(IntSupplier function) {
        return function.getAsInt();
    }
}
