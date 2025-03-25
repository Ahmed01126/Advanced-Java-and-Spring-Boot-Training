package com.example.spring3.dao;

import com.example.spring3.model.entity.Student;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class StudentRepo {

    private static final String CLASS_NAME = StudentRepo.class.getSimpleName();

    private static StudentRepo studentRepo;
    @Getter
    private final Map<String, Student> studentMap;

    public StudentRepo() {
        studentMap = new HashMap<>();
    }

    public static StudentRepo getInstance() {
        if (studentRepo == null) {
            studentRepo = new StudentRepo();
        }
        return studentRepo;
    }

    public void insertOrUpdateStudent(Student student) {
        String methodName = CLASS_NAME + ".insertOrUpdateStudent()";
        studentMap.put(student.getId(), student);
        log.info("Student inserted/updated successfully");
        log.debug("{}, Student id: {}", methodName, student.getId());
    }

    public int countStudents() {
        return studentMap.size();
    }

    public void clear() {
        studentMap.clear();
    }

    public Collection<Student> findAll() {
        return studentMap.values();
    }

    public void removeStudent(String key) {
        studentMap.remove(key);
        log.info("Student removed successfully with id: {}", key);
    }
}
