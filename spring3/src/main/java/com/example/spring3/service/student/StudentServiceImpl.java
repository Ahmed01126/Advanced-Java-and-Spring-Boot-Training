package com.example.spring3.service.student;

import com.example.spring3.dao.StudentRepo;
import com.example.spring3.model.dto.StudentDto;
import com.example.spring3.model.entity.Student;
import com.example.spring3.util.StudentTransformation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Component
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
        log.info("Successfully injected StudentRepo into StudentService");
    }

    public void insertStudent(StudentDto studentDto) {
        Student createdStudent = StudentTransformation.toStudent(studentDto);

        studentRepo.insertOrUpdateStudent(createdStudent);
    }

    @Override
    public void updateStudent(String id, StudentDto studentDto) {
        Student updatedStudent = StudentTransformation.toStudent(id, studentDto);

        studentRepo.insertOrUpdateStudent(updatedStudent);
    }

    public Map<String, Student> getStudentMap() {
        return studentRepo.getStudentMap();
    }

    public int countStudents() {
        return studentRepo.countStudents();
    }

    public void clear() {
        studentRepo.clear();
    }

    public Collection<StudentDto> findAll() {
        return studentRepo.findAll()
                .stream()
                .map(StudentTransformation::toStudentDto)
                .toList();
    }

    public void removeStudent(String key) {
        studentRepo.removeStudent(key);
    }

    public Optional<StudentDto> findFirstStudent() {
        return studentRepo.findAll()
                .stream()
                .map(StudentTransformation::toStudentDto)
                .findFirst();
    }
}
