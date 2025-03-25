package com.pioneers.docker.repository.student;

import com.pioneers.docker.model.entity.Student;

import java.util.List;

public interface StudentCustomRepo {

    List<Student> findAllByPartOfNameAndGreaterThanAge(String name, int age);
}
