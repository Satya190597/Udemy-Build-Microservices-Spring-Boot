package com.restful.web.services.restfulwebservices.service;

import com.restful.web.services.restfulwebservices.dto.Employee;
import com.restful.web.services.restfulwebservices.exception.EmployeeNotFound;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList = new ArrayList<>();

    public Employee save(Employee employee) {
        if (!isEmployeeIdPresent(employee))
            employee.setEmployeeId(UUID.randomUUID().toString());
        employeeList.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    public Employee getEmployeeById(String employeeId) {
        return employeeList.stream().filter((employee -> employee.getEmployeeId().equalsIgnoreCase(employeeId)))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFound("Employee Not Found"));
    }

    private boolean isEmployeeIdPresent(Employee employee) {
        return !Objects.isNull(employee.getEmployeeId()) || !Objects.isNull(employee.getEmailId());
    }
}
