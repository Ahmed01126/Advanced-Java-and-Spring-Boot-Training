package com.spring.jpa.repository.student;

import com.spring.jpa.model.entity.Student;

import java.util.List;

public interface StudentCustomRepo {

    List<Student> findAllByPartOfNameAndGreaterThanAge(String name, int age);
}
