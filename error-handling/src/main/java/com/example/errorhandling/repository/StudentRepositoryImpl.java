package com.example.errorhandling.repository;

import com.example.errorhandling.model.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Component
public class StudentRepositoryImpl implements StudentRepository {

    private static final String CLASS_NAME = StudentRepositoryImpl.class.getSimpleName();

    private final Map<String, Student> studentMap;

    public StudentRepositoryImpl() {
        studentMap = new HashMap<>();
    }

    public void insertOrUpdateStudent(Student student) {
        String methodName = CLASS_NAME + ".insertOrUpdateStudent()";
        studentMap.put(student.getId(), student);
        log.info("Student inserted/updated successfully");
        log.debug("{}, Student id: {}", methodName, student.getId());
    }

    @Override
    public Student findById(String id) {
        return studentMap.get(id);
    }

    @Override
    public Optional<Student> findByEmail(String email) {
        return studentMap.values()
                .stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst();
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

    @Override
    public boolean contains(String id) {
        return studentMap.containsKey(id);
    }

    @Override
    public boolean containsEmail(String email) {
        return studentMap.values()
                .stream()
                .anyMatch(student -> student.getEmail().equals(email));
    }
}
