package com.yourdomain.Dao;

import com.yourdomain.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudentById(Student student);

    void insertStudent(Student student);
}
