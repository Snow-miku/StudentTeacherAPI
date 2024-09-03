package com.snowmiku.studentteacherapi.repository;

import com.snowmiku.studentteacherapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}