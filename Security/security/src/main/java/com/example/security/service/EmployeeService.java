package com.example.security.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.security.model.Employee;

@Service
public class EmployeeService {
    
    private List<Employee> empList = new ArrayList<>();

    public EmployeeService(){
        empList.add(new Employee(UUID.randomUUID().toString(), "aryan", "aryan@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(), "ritesh", "ritesh@gmail.com"));
        
    }

    public List<Employee> getEmployees(){
        return empList;
    }
}
