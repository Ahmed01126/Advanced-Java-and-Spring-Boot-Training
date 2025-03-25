package com.example.functionprogramming.general;

import lombok.Data;

import java.util.function.Function;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String email;


    public static String getStudentInfo(Function<Student, String> function, Student student) {
        return function.apply(student);
    }

    /**
     * Creates the full name for the student.
     *
     * @param student input student
     * @return concatenation of first name and last name.
     */
    public static String getStudentName(Student student) {
        return student.firstName.trim() + " " + student.lastName.trim();
    }

    public static String getStudentEmail(Student student) {
        return student.email;
    }
}
