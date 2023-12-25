package com.restful.web.services.restfulwebservices.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WelcomeMessageDetail {
    private String message;
    private User user;
}
