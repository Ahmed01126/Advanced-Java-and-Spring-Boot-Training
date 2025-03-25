package com.pioneers.docker.repository.cache.student;

import com.pioneers.docker.model.dto.StudentDto;
import com.pioneers.docker.model.entity.Student;
import com.pioneers.docker.repository.student.StudentRepo;
import com.pioneers.docker.util.transformation.StudentTransformation;
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
