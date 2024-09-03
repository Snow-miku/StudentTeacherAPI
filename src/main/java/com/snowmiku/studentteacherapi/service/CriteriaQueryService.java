package com.snowmiku.studentteacherapi.service;

import com.snowmiku.studentteacherapi.entity.Student;

import java.util.List;

public interface CriteriaQueryService {
    List<Student> getStudentsWithTeachers(Long studentIdThreshold);
}
