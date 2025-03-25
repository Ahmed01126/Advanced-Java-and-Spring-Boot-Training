package com.example.spring3.util;

import com.example.spring3.model.dto.StudentDto;
import com.example.spring3.model.entity.Student;

public class StudentTransformation {

    private StudentTransformation() {
    }

    public static StudentDto toStudentDto(Student student) {
        return new StudentDto(student.getName(), student.getEmail(), student.getAge());
    }

    public static Student toStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(String.valueOf(RepoUtils.ID));
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setAge(studentDto.getAge());
        RepoUtils.ID++;

        return student;
    }

    public static Student toStudent(String id, StudentDto studentDto) {
        Student student = new Student();
        student.setId(id);
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setAge(studentDto.getAge());

        return student;
    }
}
