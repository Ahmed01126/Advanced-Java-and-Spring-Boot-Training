package com.example.spring2.config;

import com.example.demo.config.StudentProperties;
import com.example.demo.model.Address;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    /*@Value("${student.address.country}")
    private String country;

    @Value("${student.address.city}")
    private String city;

    @Value("${student.address.street}")
    private String street;

    @Value("${student.address.buildingNumber}")
    private int buildingNumber;*/

    private final StudentProperties studentProperties;

    @Autowired
    public Config(StudentProperties studentProperties) {
        this.studentProperties = studentProperties;
    }

    @Bean
    public Address address() {
        System.out.println("Creating Address bean with the values from the application.properties file.");
        return new Address(
                studentProperties.getAddress().getCountry(),
                studentProperties.getAddress().getCity(),
                studentProperties.getAddress().getStreet(),
                studentProperties.getAddress().getBuildingNumber()
        );
    }

    @Bean
    public Student student() {
        System.out.println("Creating Student bean with the values from the application.properties file.");
        return new Student(studentProperties.getName(), studentProperties.getAge());
    }
}
