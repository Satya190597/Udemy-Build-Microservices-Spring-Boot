package com.spring.jpa.springjpa.service;

import com.spring.jpa.springjpa.dto.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> getAll();
    Employee getById(String employeeId);
    boolean deleteById(String employeeId);
}
