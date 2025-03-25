package com.example.errorhandling.service.student;

import com.example.errorhandling.error.exception.StudentNotFoundException;
import com.example.errorhandling.model.dto.StudentDto;

import java.util.Collection;

public interface StudentService {

    void insertStudent(StudentDto studentDto);

    void updateStudent(String id, StudentDto studentDto);

    int countStudents();

    void clear();

    Collection<StudentDto> findAll();

    StudentDto findById(String id) throws StudentNotFoundException;

    StudentDto findByEmail(String email) throws StudentNotFoundException;

    void removeStudent(String key);

    StudentDto findFirstStudent();

    boolean contains(String id);

    boolean containsEmail(String email);
}
