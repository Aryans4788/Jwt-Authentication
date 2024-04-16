package com.example.security.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.security.model.Employee;
import com.example.security.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/welcome")
@Slf4j
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    
    @GetMapping("/employee")
    public List<Employee> getEmployees()
    {
        log.info("Get Employee List");
       return employeeService.getEmployees();
    }
 
    
}
