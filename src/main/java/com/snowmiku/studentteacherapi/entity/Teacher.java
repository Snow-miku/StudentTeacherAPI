package com.snowmiku.studentteacherapi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "teacher")
    private List<StudentTeacher> studentTeachers;

    // Getters and Setters
}
