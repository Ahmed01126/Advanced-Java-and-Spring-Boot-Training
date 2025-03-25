package com.example.spring3.model.dto;

import com.example.spring3.util.designpattern.builder.Address;

public class LombokTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Hanaa");
        employee.setEmail("hanaa@pioneers.com");
        employee.setAge(23);
        employee.setAddress(new Address());
        employee.setSalary(100000);

        System.out.println(employee.getSalary());

        System.out.println(employee);
    }
}
