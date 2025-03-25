package com.spring.jpa.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressDto {
    private int apartmentNumber;
    private int homeNumber;
    private String street;
    private String city;
    private String state;
    private String country;
}
