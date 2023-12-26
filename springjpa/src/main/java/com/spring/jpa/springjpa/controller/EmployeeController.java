package com.spring.jpa.springjpa.controller;

import com.spring.jpa.springjpa.dto.Employee;
import com.spring.jpa.springjpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") String employeeId) {
        return employeeService.getById(employeeId);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEmployeeById(@PathVariable("id") String employeeId) {
        return employeeService.deleteById(employeeId);
    }
}
