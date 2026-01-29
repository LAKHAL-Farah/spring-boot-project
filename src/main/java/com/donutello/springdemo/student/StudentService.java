package com.donutello.springdemo.student;


import java.util.List;

public interface StudentService {
    Student save (Student s);
    List<Student> findAllStudents();
    Student findByEmail(String email);
    void delete(String email);
    Student updateStudent  (Student s);


}
