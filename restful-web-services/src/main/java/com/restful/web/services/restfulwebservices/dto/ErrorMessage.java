package com.restful.web.services.restfulwebservices.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Data
@Getter
@Setter
@Builder
public class ErrorMessage {
    private HttpStatus status;
    private String message;
}
