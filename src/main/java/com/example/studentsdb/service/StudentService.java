package com.example.studentsdb.service;

import com.example.studentsdb.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student insertOrUpdateStudent(Student student);

    Student addStudent(Student student);

    void removeStudent(Long id);

}
