CREATE TABLE student (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(255) NOT NULL
);

CREATE TABLE teacher (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(255) NOT NULL
);

CREATE TABLE student_teacher (
     student_id BIGINT NOT NULL,
     teacher_id BIGINT NOT NULL,
     PRIMARY KEY (student_id, teacher_id),
     FOREIGN KEY (student_id) REFERENCES student(id),
     FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);
