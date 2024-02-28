package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepo er;

    public EmployeeService(EmployeeRepo er) {
        this.er = er;
    }
    
    @SuppressWarnings("null")
    public Employee insert(Employee e)
    {
        return er.save(e);
    }
    @SuppressWarnings("null")
    public Employee update(Employee e)
    {
        return er.save(e);
    }
    public  boolean delete(int id)
    {
        er.deleteById(id);
        return true;
    }
}