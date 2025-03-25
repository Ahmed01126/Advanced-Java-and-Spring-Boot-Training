package com.spring.jpa.repository.cache.student;

import com.spring.jpa.model.dto.StudentDto;
import com.spring.jpa.model.entity.Student;
import com.spring.jpa.repository.student.StudentRepo;
import com.spring.jpa.util.transformation.StudentTransformation;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Component
public class StudentCacheRepository {

    private static final Map<UUID, Student> studentMap = new HashMap<>();

    private final StudentRepo studentRepo;

    @Autowired
    public StudentCacheRepository(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public static List<StudentDto> findAll() {
        return studentMap.values().stream().map(StudentTransformation::toStudentDto).toList();
    }

    public static void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

    @PostConstruct
    public void populateStudentMap() {
        studentMap.clear();

        List<Student> students = studentRepo.findAll();
        students.forEach(StudentCacheRepository::addStudent);
    }


}
