package com.example.functionprogramming.error;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> filteredList = list.stream()
                .filter(Test::lessThan)
                .toList();

        System.out.println(filteredList);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean greaterThan(int number) {
        return number > 2;
    }

    public static boolean lessThan(int number) {
        return number < 4;
    }
}
