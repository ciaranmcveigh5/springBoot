package com.yourdomain.Service;

import com.yourdomain.Dao.StudentDao;
import com.yourdomain.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mockData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudentById(Student student) {
        this.studentDao.updateStudentById(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudent(student);
    }
}
