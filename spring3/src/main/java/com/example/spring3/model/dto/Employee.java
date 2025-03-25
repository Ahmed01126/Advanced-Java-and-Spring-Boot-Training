package com.example.spring3.model.dto;

import com.example.spring3.util.designpattern.builder.Address;
import lombok.*;

@Getter
@Setter
//@ToString
//@ToString(onlyExplicitlyIncluded = true)
//@ToString(of = {"name", "email", "age"})
//@ToString(exclude = {"address", "salary"})
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Employee {
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    @ToString.Exclude
    private int age;
    @ToString.Exclude
    private float salary;
    @ToString.Exclude
    private Address address;
}
