package com.snowmiku.studentteacherapi.entity;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "student")
    private List<StudentTeacher> studentTeachers;

    // Getters and Setters
}
