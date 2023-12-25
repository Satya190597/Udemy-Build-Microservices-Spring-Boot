package com.restful.web.services.restfulwebservices.service;

import com.restful.web.services.restfulwebservices.dto.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(String employeeId);
    boolean deleteEmployeeById(String employeeId);
}
