package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// REST Controller for managing employees
@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    // GET endpoint to fetch all employees
    @GetMapping("/employees")
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }
}