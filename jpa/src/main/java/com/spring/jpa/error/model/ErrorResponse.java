package com.spring.jpa.error.model;

import lombok.Value;

import java.sql.Timestamp;

@Value
public class ErrorResponse {
    // public record ErrorResponse(int code, String message, String description) {)
    int code;
    String message;
    String description;
    Timestamp timestamp;
}
