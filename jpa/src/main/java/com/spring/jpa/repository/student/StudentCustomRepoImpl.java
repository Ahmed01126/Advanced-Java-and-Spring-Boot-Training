package com.spring.jpa.repository.student;

import com.spring.jpa.model.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class StudentCustomRepoImpl implements StudentCustomRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> findAllByPartOfNameAndGreaterThanAge(String name, int age) {
        String jpql = "SELECT s FROM Student s WHERE s.age > :age AND s.name LIKE :name";
        TypedQuery<Student> typedQuery = entityManager.createQuery(jpql, Student.class);
        typedQuery.setParameter("name", "%" + name + "%");
        typedQuery.setParameter("age", age);

        return typedQuery.getResultList();
    }
}
