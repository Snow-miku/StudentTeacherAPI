package com.snowmiku.studentteacherapi.service;

import com.snowmiku.studentteacherapi.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriteriaQueryServiceImpl implements CriteriaQueryService {

    @Autowired
    private EntityManager entityManager;

    public List<Student> getStudentsWithTeachers(Long studentIdThreshold) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> query = cb.createQuery(Student.class);
        Root<Student> student = query.from(Student.class);

        query.select(student).where(cb.greaterThan(student.get("id"), studentIdThreshold));

        return entityManager.createQuery(query).getResultList();
    }
}
