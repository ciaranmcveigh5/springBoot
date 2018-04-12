package com.yourdomain.Dao;

import com.yourdomain.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Qualifier("sqlData")
public class sqlStudentDaoImpl implements StudentDao {
    @Override
    public Collection<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudentById(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
