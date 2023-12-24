package com.restful.web.services.restfulwebservices.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WelcomeMessage {
    private String message;
    private String user;
}
