package com.example.spring3.util.designpattern.builder;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String pinCode;
    private String landmark;
    private int buildingNumber;
    private int floorNumber;
    private int apartmentNumber;

    /*public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public Address(AddressBuilder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
        this.pinCode = builder.pinCode;
        this.landmark = builder.landmark;
        this.buildingNumber = builder.buildingNumber;
        this.floorNumber = builder.floorNumber;
        this.apartmentNumber = builder.apartmentNumber;
    }

    public static class AddressBuilder {
        private String street;
        private String city;
        private String state;
        private String country;
        private String pinCode;
        private String landmark;
        private int buildingNumber;
        private int floorNumber;
        private int apartmentNumber;

        public AddressBuilder street(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder city(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder state(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder country(String country) {
            this.country = country;
            return this;
        }

        public AddressBuilder pinCode(String pinCode) {
            this.pinCode = pinCode;
            return this;
        }

        public AddressBuilder landmark(String landmark) {
            this.landmark = landmark;
            return this;
        }

        public AddressBuilder buildingNumber(Integer buildingNumber) {
            this.buildingNumber = buildingNumber;
            return this;
        }

        public AddressBuilder floorNumber(Integer floorNumber) {
            this.floorNumber = floorNumber;
            return this;
        }

        public AddressBuilder apartmentNumber(Integer apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }*/
}
