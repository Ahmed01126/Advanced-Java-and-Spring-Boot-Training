package com.pioneers.docker.util.transformation;

import com.pioneers.docker.model.dto.AddressDto;
import com.pioneers.docker.model.dto.StudentDto;
import com.pioneers.docker.model.entity.Address;
import com.pioneers.docker.model.entity.Student;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import static com.pioneers.docker.util.transformation.AddressTransformation.toAddress;
import static com.pioneers.docker.util.transformation.AddressTransformation.toAddressDto;

public class StudentTransformation {

    private StudentTransformation() {
    }

    public static StudentDto toStudentDto(Student student) {
        StudentDto.StudentDtoBuilder studentDtoBuilder = StudentDto.builder()
                .name(student.getName())
                .email(student.getEmail())
                .age(student.getAge())
                .marks(student.getMarks())
                .phone(student.getPhone());

        Optional<AddressDto> addressDtoOptional = toAddressDto(student.getAddress());
        addressDtoOptional.ifPresent(studentDtoBuilder::addressDto);

        return studentDtoBuilder.build();
    }

    public static Student toStudent(StudentDto studentDto) {
        Student.StudentBuilder studentBuilder = Student.builder();
        studentBuilder.id(UUID.randomUUID());
        studentBuilder.name(studentDto.getName());
        studentBuilder.email(studentDto.getEmail());
        studentBuilder.age(studentDto.getAge());
        studentBuilder.marks(studentDto.getMarks());
        studentBuilder.phone(studentDto.getPhone());

        if (Objects.nonNull(studentDto.getAddressDto())) {
            Address address = toAddress(studentDto.getAddressDto());
            studentBuilder.addressId(address.getId());
            studentBuilder.address(address);
        }

        return studentBuilder.build();
    }
}
