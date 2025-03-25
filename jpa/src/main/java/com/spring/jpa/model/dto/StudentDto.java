package com.spring.jpa.model.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
@AllArgsConstructor
public class StudentDto {
    @NonNull
    @Size(min = 2, max = 30, message = "Name is required and should be between 2 and 30 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @NonNull
    @Email(message = "Email is not Valid")
    private String email;

    @NonNull
    @Min(value = 18, message = "Student is required and must be elder that 18 years")
    @Max(value = 30, message = "Student is required and must be younger that 30 years")
    private int age;

    private float marks;

    @Pattern(regexp = "\\+201[0-2,5]\\d{8}$", message = "Phone number must be valid according to Egypt's criteria")
    private String phone;

    private AddressDto addressDto;
}
