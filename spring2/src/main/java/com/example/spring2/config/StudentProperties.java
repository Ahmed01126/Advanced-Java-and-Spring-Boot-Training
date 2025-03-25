package com.example.spring2.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties(StudentProperties.class)
@ConfigurationProperties(prefix = "student")
public class StudentProperties {

    private String name;
    private int age;

    private AddressProperties address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AddressProperties getAddress() {
        return address;
    }

    public void setAddress(AddressProperties address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class AddressProperties {
        private String country;
        private String city;
        private String street;
        private int buildingNumber;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuildingNumber() {
            return buildingNumber;
        }

        public void setBuildingNumber(int buildingNumber) {
            this.buildingNumber = buildingNumber;
        }
    }
}
