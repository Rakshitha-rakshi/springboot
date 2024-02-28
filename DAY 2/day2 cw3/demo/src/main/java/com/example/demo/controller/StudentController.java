package com.example.demo.controller;
import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/ignore")
    public Student st()
    {
        Student s=new Student(101, "karthi", "He is a boy");
        return s;
    }
}