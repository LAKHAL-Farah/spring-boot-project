package com.donutello.springdemo.student;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public Student save(
            @RequestBody Student student
    ){
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable("email") String email){
        return studentService.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(
        @RequestBody Student student
    ){
        return studentService.updateStudent(student);

    }
    @DeleteMapping("/{email}")
    public void delete( @PathVariable("email") String email ){
        studentService.delete(email);
    }
}
