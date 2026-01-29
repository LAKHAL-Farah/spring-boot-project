package com.donutello.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class InMemoryStudentService implements StudentService{


    private final InMemoryStudentDAO dao;

    public InMemoryStudentService(InMemoryStudentDAO dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }



    @Override
    public Student findByEmail(String email) {
        return  dao.findByEmail(email);
    }

    @Override
    public void delete(String s) {
        dao.delete(s);

    }

    @Override
    public Student updateStudent(Student s) {
        return dao.updateStudent(s);
    }
}
