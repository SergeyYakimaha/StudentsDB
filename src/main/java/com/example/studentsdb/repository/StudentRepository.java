package com.example.studentsdb.repository;

import com.example.studentsdb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}