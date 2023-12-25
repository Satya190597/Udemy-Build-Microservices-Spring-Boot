package com.restful.web.services.restfulwebservices.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String departmentId;
}
