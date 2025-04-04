package com.pioneers.docker.error.exception;

import com.pioneers.docker.util.time.TimingUtilities;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Value
public class StudentNotFoundException extends RuntimeException {
    int errorCode = 1000;
    String errorMessage = "studentNotFound";
    String description;
    Timestamp currentTime;

    public StudentNotFoundException(String description) {
        super(description);
        this.description = description;
        this.currentTime = TimingUtilities.currentTimestamp();
    }
}
