package com.example.spring3.dao;


import com.example.spring3.model.dto.StudentDto;

import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<StudentDto> studentDtoSet = new HashSet<>();
        studentDtoSet.add(new StudentDto());

        HashMap<String, StudentDto> studentDtoMap = new HashMap<>();
        studentDtoMap.put("email", new StudentDto());

        function4();
        function5();
        function1(studentDtoSet, studentDtoMap);
        function7();
    }

    public static void function1(HashSet<StudentDto> studentDtoSet, HashMap<String, StudentDto> studentDtoMap) {
        System.out.println("I am in function1");
        function2(studentDtoSet, studentDtoMap);
    }

    public static void function2(HashSet<StudentDto> studentDtoSet, HashMap<String, StudentDto> studentDtoMap) {
        System.out.println("I am in function2");
        function3(studentDtoSet, studentDtoMap);
    }

    public static void function3(HashSet<StudentDto> studentDtoSet, HashMap<String, StudentDto> studentDtoMap) {
        System.out.println("I am in function3");
        studentDtoSet.clear();
        studentDtoMap.clear();

    }

    public static void function4() {
        System.out.println("I am in function4");
    }

    public static void function5() {
        System.out.println("I am in function5");
        function6();
    }

    public static void function6() {
        System.out.println("I am in function6");
    }

    public static void function7() {
        System.out.println("I am in function7");
    }
}
