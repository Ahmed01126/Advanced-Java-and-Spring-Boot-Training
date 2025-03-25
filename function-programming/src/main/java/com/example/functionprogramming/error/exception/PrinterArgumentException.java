package com.example.functionprogramming.error.exception;

import lombok.Getter;

@Getter
public class PrinterArgumentException extends IllegalArgumentException {
    private final int errorCode = 5000;
    private final String errorMessage = "printerArgumentException";
    private final String description;

    public PrinterArgumentException(String errorDescription) {
        this.description = errorDescription;
    }
}
