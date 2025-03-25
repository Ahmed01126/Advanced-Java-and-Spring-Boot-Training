package com.spring.jpa.util.transformation;

import com.spring.jpa.model.dto.AddressDto;
import com.spring.jpa.model.entity.Address;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class AddressTransformation {

    private AddressTransformation() {
    }

    public static Address toAddress(AddressDto addressDto) {
        return Address.builder()
                .id(UUID.randomUUID())
                .apartmentNumber(addressDto.getApartmentNumber())
                .homeNumber(addressDto.getHomeNumber())
                .street(addressDto.getStreet())
                .city(addressDto.getCity())
                .state(addressDto.getState())
                .country(addressDto.getCountry())
                .build();
    }

    public static Optional<AddressDto> toAddressDto(Address address) {
        if (Objects.isNull(address)) return Optional.empty();
        return Optional.of(AddressDto.builder()
                .apartmentNumber(address.getApartmentNumber())
                .homeNumber(address.getHomeNumber())
                .street(address.getStreet())
                .city(address.getCity())
                .state(address.getState())
                .country(address.getCountry())
                .build());
    }
}
