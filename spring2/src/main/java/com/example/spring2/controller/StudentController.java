package com.example.spring2.controller;

import com.example.demo.config.StudentProperties;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    // Field Injection
//    @Autowired
//    private Student student;

    private final StudentProperties studentProperties;

    private final Student student;

    @Autowired
    private StudentController(Student student, StudentProperties studentProperties) {
        this.student = student;
        this.studentProperties = studentProperties;
    }

    @GetMapping("dependencyInjection")
    public Student testStudentApi() {
        /*if (Objects.isNull(student)) {
            System.out.println("Student is null!!");
        } else {
            System.out.println("Student is not null!!");
        }
        Address address = student.getAddress();
        if (address == null) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/
        // Injection in case of Optional
//        student.setAddress(new Address());

        return student;
    }

    // Setter Injection
//    @Autowired
//    public void setStudent(Student student) {
//        this.student = student;
//    }
}
