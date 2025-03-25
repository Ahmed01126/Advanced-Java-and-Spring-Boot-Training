package com.spring.jpa.repository.student;

import com.spring.jpa.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepo extends JpaRepository<Student, UUID>, StudentCustomRepo {

    Optional<Student> findByEmail(String email);

    List<Student> findAllByAge(int age);
}
