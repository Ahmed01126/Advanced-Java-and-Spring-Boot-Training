package com.example.spring3.util.designpattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
//        Address address = new Address("Street1", "city1", "state1", "country1", "pinCode1", "landmark1", 1, 1, 1);


//        Employee employee = new Employee("Ahmed", "ahmed@pioneers.com", 21, 100, new Address().setStreet("street1").setCity("city1").setState("State1").setCountry("Egypt").setPinCode("pinCode1").setLandmark("landmark1").setBuildingNumber(1).setFloorNumber(1).setApartmentNumber(1));

        Address address1 = Address.builder()
                .street("Alrawda Street")
                .city("Cairo")
                .state("Almanial")
                .country("Egypt")
                .pinCode("4240101")
                .landmark("Alrawda")
                .buildingNumber(1)
                .floorNumber(1)
                .apartmentNumber(1)
                .build();

        System.out.println(address1);


        /*Address address = new Address.builder()
                .setStreet("Alrawda Street")
                .setCity("Cairo")
                .setState("Almanial")
                .setCountry("Egypt")
                .setPinCode("4240101")
                .setLandmark("Alrawda")
                .setBuildingNumber(1)
                .setFloorNumber(1)
                .setApartmentNumber(1)
                .build();

        System.out.println(address);*/
    }
}
