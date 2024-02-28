package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
    
    StudentRepository studentRepository;
    StudentService(StudentRepository stu)
    {
        studentRepository=stu;
    }
    @SuppressWarnings("null")
    public Student postStudents(Student s)
    {
        return studentRepository.save(s);
    }

}