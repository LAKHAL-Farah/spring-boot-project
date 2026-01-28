package com.donutello.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student("Donutello","the cat", LocalDate.now(),"donutello@rb.com",1),
                new Student("Giampiero","GP", LocalDate.now(),"GP@rb.com",55)

        );
    }

}
