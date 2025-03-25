package com.example.errorhandling.model.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class StudentDto {
    //    @NotBlank(message = "Name is required")
    @NonNull
    @Size(min = 2, max = 30, message = "Name is required and should be between 2 and 30 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @NonNull
    @Email(message = "Email is not Valid")
    private String email;

    @NonNull
    @Min(value = 5, message = "Student is required and must be elder that 5 years")
    @Max(value = 10, message = "Student is required and must be younger that 10 years")
    private int age;

    @Pattern(regexp = "\\+201[0-2,5]\\d{8}$", message = "Phone number must be valid according to Egypt's criteria")
    private String phone;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,20}$", message = "The password is not complex")
    private String password;
}
