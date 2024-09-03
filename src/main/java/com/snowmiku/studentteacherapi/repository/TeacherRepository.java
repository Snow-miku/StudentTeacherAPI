package com.snowmiku.studentteacherapi.repository;

import com.snowmiku.studentteacherapi.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
