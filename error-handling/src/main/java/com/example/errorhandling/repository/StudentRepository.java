package com.example.errorhandling.repository;

import com.example.errorhandling.model.entity.Student;

import java.util.Collection;
import java.util.Optional;

public interface StudentRepository {
    void insertOrUpdateStudent(Student student);

    Student findById(String id);

    Optional<Student> findByEmail(String email);

    int countStudents();

    void clear();

    Collection<Student> findAll();

    void removeStudent(String key);

    boolean contains(String id);

    boolean containsEmail(String email);
}
