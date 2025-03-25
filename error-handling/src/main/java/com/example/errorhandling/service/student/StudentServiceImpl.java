package com.example.errorhandling.service.student;

import com.example.errorhandling.error.exception.StudentNotFoundException;
import com.example.errorhandling.model.dto.StudentDto;
import com.example.errorhandling.model.entity.Student;
import com.example.errorhandling.repository.StudentRepository;
import com.example.errorhandling.util.RepoUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        log.info("Successfully injected StudentRepo into StudentService");
    }

    @Override
    public void insertStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(String.valueOf(RepoUtils.ID));
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setAge(studentDto.getAge());
        RepoUtils.ID++;

        studentRepository.insertOrUpdateStudent(student);
    }

    @Override
    public void updateStudent(String id, StudentDto studentDto) {
        Student student = new Student();
        student.setId(id);
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setAge(studentDto.getAge());

        studentRepository.insertOrUpdateStudent(student);
    }



    @Override
    public int countStudents() {
        return studentRepository.countStudents();
    }

    @Override
    public void clear() {
        studentRepository.clear();
    }

    @Override
    public Collection<StudentDto> findAll() {
        return studentRepository.findAll()
                .stream()
                .map(student -> new StudentDto(student.getName(), student.getEmail(), student.getAge()))
                .toList();
    }

    @Override
    public StudentDto findById(String id) throws StudentNotFoundException {
        Student student = studentRepository.findById(id);
        return new StudentDto(student.getName(), student.getEmail(), student.getAge());
    }

    @Override
    public StudentDto findByEmail(String email) throws StudentNotFoundException {
        Student student = studentRepository.findByEmail(email)
                .orElseThrow(() -> new StudentNotFoundException("Student with email: " + email + " id not found"));
        return new StudentDto(student.getName(), student.getEmail(), student.getAge());
    }

    @Override
    public void removeStudent(String key) {
        studentRepository.removeStudent(key);
    }

    @Override
    public StudentDto findFirstStudent() {
        return studentRepository.findAll()
                .stream()
                .map(student -> new StudentDto(student.getName(), student.getEmail(), student.getAge()))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("First Student is not found"));
    }

    @Override
    public boolean contains(String id) {
        return studentRepository.contains(id);
    }

    @Override
    public boolean containsEmail(String email) {
        return studentRepository.containsEmail(email);
    }
}
