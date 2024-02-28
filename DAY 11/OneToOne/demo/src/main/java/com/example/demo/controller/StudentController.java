package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    private StudentService studentService;
    private StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        return studentService.postStudents(student);
    }
}