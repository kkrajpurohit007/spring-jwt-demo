package com.codebook.spring_jwt_service.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiException {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
}
