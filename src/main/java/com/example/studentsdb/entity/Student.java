package com.example.studentsdb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Student {
    @Id
    private Long id;
    private String firstName;
    private String LastName;
    private int age;
}
