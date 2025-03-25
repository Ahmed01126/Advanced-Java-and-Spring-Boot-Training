package com.example.spring3.service.student;

import com.example.spring3.model.dto.StudentDto;
import com.example.spring3.model.entity.Student;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

public interface StudentService {

    void insertStudent(StudentDto studentDto);

    void updateStudent(String id, StudentDto studentDto);

    Map<String, Student> getStudentMap();

    int countStudents();

    void clear();

    Collection<StudentDto> findAll();

    void removeStudent(String key);

    Optional<StudentDto> findFirstStudent();
}
