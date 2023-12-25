package com.restful.web.services.restfulwebservices.exception;

import com.restful.web.services.restfulwebservices.dto.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFound.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFound(EmployeeNotFound employeeNotFound) {
        return ErrorMessage.builder().status(HttpStatus.NOT_FOUND).message(employeeNotFound.getMessage()).build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage genericException(Exception exception) {
        return ErrorMessage.builder().status(HttpStatus.INTERNAL_SERVER_ERROR).message(exception.getMessage()).build();
    }
}
