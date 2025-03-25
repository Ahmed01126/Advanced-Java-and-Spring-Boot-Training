package com.spring.jpa.error;

import com.spring.jpa.error.exception.StudentNotFoundException;
import com.spring.jpa.error.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static com.spring.jpa.util.time.TimingUtilities.currentTimestamp;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleStudentNotFoundException(MethodArgumentNotValidException exception) {

        StringBuilder errorMessage = new StringBuilder();
        StringBuilder errorDescription = new StringBuilder();

        exception.getBindingResult().getFieldErrors().forEach(error -> {
            errorMessage.append(error.getField());
            errorDescription.append(error.getDefaultMessage());
        });

        ErrorResponse errorResponse =
                new ErrorResponse(2000, errorMessage.toString(), errorDescription.toString(), currentTimestamp());

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleStudentNotFoundException(StudentNotFoundException exception) {
        ErrorResponse errorResponse = new ErrorResponse(
                exception.getErrorCode(),
                exception.getErrorMessage(),
                exception.getDescription(),
                exception.getCurrentTime()
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
