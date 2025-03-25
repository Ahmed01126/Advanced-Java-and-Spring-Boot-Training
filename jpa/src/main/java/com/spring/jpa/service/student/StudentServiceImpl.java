package com.spring.jpa.service.student;

import com.spring.jpa.error.exception.StudentNotFoundException;
import com.spring.jpa.model.dto.StudentDto;
import com.spring.jpa.model.entity.Student;
import com.spring.jpa.repository.student.StudentRepo;
import com.spring.jpa.util.transformation.StudentTransformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static com.spring.jpa.util.transformation.StudentTransformation.toStudent;
import static com.spring.jpa.util.transformation.StudentTransformation.toStudentDto;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public void save(StudentDto studentDto) {
        Student student = toStudent(studentDto);
        studentRepo.save(student);
    }

    @Override
    public void update(StudentDto studentDto) {
        Student student = studentRepo.findByEmail(studentDto.getEmail())
                .orElseThrow(() -> new StudentNotFoundException("First Student is not found"));
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setAge(studentDto.getAge());
        student.setMarks(studentDto.getMarks());
        student.setPhone(studentDto.getPhone());
        studentRepo.save(student);
    }

    @Override
    public void delete(UUID id) {
        studentRepo.findById(id).ifPresent(studentRepo::delete);
    }

    @Override
    public StudentDto findById(UUID id) {
        Student student =
                studentRepo.findById(id).orElseThrow(() -> new StudentNotFoundException("First Student is not found"));

        return toStudentDto(student);
    }

    @Override
    public List<StudentDto> findAll() {
        List<Student> students = studentRepo.findAll();
        return students.stream().map(StudentTransformation::toStudentDto).toList();
    }

    @Override
    public List<StudentDto> findAllByAge(int age) {
        return studentRepo.findAllByAge(age)
                .stream()
                .map(StudentTransformation::toStudentDto)
                .toList();
    }

    @Override
    public List<StudentDto> findAllByPartOfNameAndGreaterThanAge(String name, int age) {
        return studentRepo.findAllByPartOfNameAndGreaterThanAge(name, age)
                .stream()
                .map(StudentTransformation::toStudentDto)
                .toList();
    }

    @Override
    public long count() {
        return studentRepo.count();
    }
}
