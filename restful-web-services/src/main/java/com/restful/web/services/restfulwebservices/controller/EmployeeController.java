package com.restful.web.services.restfulwebservices.controller;

import com.restful.web.services.restfulwebservices.dto.Employee;
import com.restful.web.services.restfulwebservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") String employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEmployeeById(@PathVariable("id") String employeeId) {
        return employeeService.deleteEmployeeById(employeeId);
    }
}
