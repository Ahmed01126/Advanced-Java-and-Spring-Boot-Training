package com.pioneers.docker.service.student;

import com.pioneers.docker.model.dto.StudentDto;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    void save(StudentDto studentDto);

    void update(StudentDto studentDto);

    void delete(UUID id);

    StudentDto findById(UUID id);

    List<StudentDto> findAll();

    List<StudentDto> findAllByAge(int age);

    List<StudentDto> findAllByPartOfNameAndGreaterThanAge(String name, int age);

    long count();
}
