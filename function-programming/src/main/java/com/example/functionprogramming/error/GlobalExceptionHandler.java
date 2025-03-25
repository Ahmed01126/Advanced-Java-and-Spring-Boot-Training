package com.example.functionprogramming.error;


import com.example.functionprogramming.error.exception.PrinterArgumentException;
import com.example.functionprogramming.error.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.Timestamp;
import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PrinterArgumentException.class)
    public ResponseEntity<ErrorResponse> handlePrinterArgumentException(PrinterArgumentException exception) {
        ErrorResponse errorResponse = new ErrorResponse(
                exception.getErrorCode(),
                exception.getErrorMessage(),
                exception.getDescription(),
                Timestamp.from(Instant.now())
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
