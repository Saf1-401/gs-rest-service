package com.example.restservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {

    @Test
    void testAddEmployee() {
        EmployeeManager manager = new EmployeeManager();
        Employee emp = new Employee();
        emp.setFirstName("Alice");
        emp.setLastName("Johnson");

        manager.addEmployee(emp);

        assertEquals(4, manager.getAllEmployees().getEmployeeList().size());
        assertEquals("Alice", manager.getAllEmployees().getEmployeeList().get(3).getFirstName());
    }

    @Test
    void testGetAllEmployeesEmpty() {
        EmployeeManager manager = new EmployeeManager();
        assertEquals(3, manager.getAllEmployees().getEmployeeList().size());
    }
}