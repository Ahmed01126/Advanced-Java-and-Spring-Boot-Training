package com.example.spring2.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

//@Component
public class Student {
    private String name;
    private int age;
    private Address address;

    // Constructor Injection
//    @Autowired
//    private Student(Address address) {
//        this.address = address;
//    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired(required = false)
    public void setAddress(Address address) {
        this.address = address;
        if (Objects.nonNull(address)) {
            System.out.println("Setter Injection Occurred for Address inside Student");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
