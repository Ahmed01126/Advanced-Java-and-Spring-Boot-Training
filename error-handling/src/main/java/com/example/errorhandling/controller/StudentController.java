package com.example.errorhandling.controller;

import com.example.errorhandling.error.exception.StudentNotFoundException;
import com.example.errorhandling.model.dto.StudentDto;
import com.example.errorhandling.service.student.StudentService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
        log.info("Successfully injected StudentService into StudentsController");
    }

    @PostMapping("insert")
    public void insertStudentApi(@RequestBody StudentDto studentDto) {
        if (!studentService.containsEmail(studentDto.getEmail())) {
            studentService.insertStudent(studentDto);
            log.debug("Successfully added {} into the hashMap ", studentDto);
        }
    }

    @GetMapping("size")
    public int listSizeApi() {
        log.debug("Students size is: {}", studentService.countStudents());
        return studentService.countStudents();
    }

    @GetMapping("findFirst")
    public StudentDto findFirstStudentApi() {
        return studentService.findFirstStudent();
    }

    @GetMapping("find/{id}")
    public StudentDto findStudentByIdApi(@PathVariable String id) throws StudentNotFoundException {
        if (!studentService.contains(id)) {
            throw new StudentNotFoundException("Student with id: " + id + " is not found!!");
        }
        return studentService.findById(id);
    }

    @GetMapping("find")
    public StudentDto findStudentByEmailApi(@RequestParam String email) throws StudentNotFoundException {
        return studentService.findByEmail(email);
    }

    @GetMapping("findAll")
    public Collection<StudentDto> findAllStudentApi() {
        return studentService.findAll();
    }

    @DeleteMapping("delete/{id}")
    public void deleteStudentApi(@PathVariable String id) {
        studentService.removeStudent(id);
    }

    @PutMapping("update/{id}")
    public void updateStudentApi(@Valid @RequestBody StudentDto studentDto, @PathVariable String id) {

        if (!studentService.contains(id)) {
            log.error("Student is not found!!");
            throw new StudentNotFoundException("Student with id: " + id + " is not found!!");
        }
        studentService.updateStudent(id, studentDto);
    }

    @DeleteMapping("removeAll")
    public void removeAllStudentsApi() {
        studentService.clear();
    }
}
