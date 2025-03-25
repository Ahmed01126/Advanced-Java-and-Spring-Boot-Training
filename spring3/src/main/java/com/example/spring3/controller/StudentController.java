package com.example.spring3.controller;

import com.example.spring3.model.dto.StudentDto;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.function.Predicate;

@RestController
@RequestMapping("student")
public class StudentController {

    private final Set<StudentDto> studentDtoSet;

    public StudentController() {
        studentDtoSet = new HashSet<>();
    }

    private static Predicate<StudentDto> getStudentDtoByNameAndAge(String name, Integer age) {
        return studentDto -> studentDto.getName().equals(name) && studentDto.getAge() == age;
    }

    private static Predicate<StudentDto> getStudentDtoByName(String name) {
        return studentDto -> studentDto.getName().equals(name);
    }

    @PostMapping("insert")
    public void insertStudentApi(@RequestBody StudentDto studentDto) {
        studentDtoSet.add(studentDto);

        System.out.println(studentDtoSet.size());
        studentDtoSet.forEach(System.out::println);
    }

    @GetMapping("size")
    public int listSizeApi() {
        return studentDtoSet.size();
    }

    @GetMapping("findFirst")
    public StudentDto findFirstStudentApi() {
        /*if (studentDtoList.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(studentDtoList.get(0));
        }*/
//        return studentDtoList.stream().findFirst();

        Optional<StudentDto> studentDtoOptional = studentDtoSet.stream().findFirst();

        /*if (studentDtoOptional.isPresent()) {
            return studentDtoOptional.get();
        }*/

        return studentDtoOptional.orElse(null);
    }

    @GetMapping("findAll")
    public List<StudentDto> findAllStudentApi() {
        return new ArrayList<>(studentDtoSet);
    }

    @DeleteMapping("deleteByEmail/{email}")
    public void deleteStudentByEmailWithPathVariableApi(@PathVariable String email) {
        /*for (StudentDto studentDto : studentDtoList) {
            if (studentDto.getEmail().equals(email)) {
                studentDtoList.remove(studentDto);
                break;
            }
        }*/
        Optional<StudentDto> studentDtoOptional = studentDtoSet.stream()
                .filter(studentDto -> studentDto.getEmail().equals(email))
                .findFirst();
        studentDtoOptional.ifPresent(studentDtoSet::remove);

        /*if (studentDtoOptional.isPresent()) {
            studentDtoList.remove(studentDtoOptional.get());
        }*/
    }

    @DeleteMapping("deleteByNameAndAge/{name}/{age}")
    public void deleteStudentByNameAndAgeApi(@PathVariable String name, @PathVariable Integer age) {
        studentDtoSet.removeIf(studentDto -> studentDto.getName().equals(name) && studentDto.getAge() == age);
    }

    @DeleteMapping("deleteByEmail")
    public void deleteStudentByEmailApi(@RequestParam(value = "email") String emaill) {
        Optional<StudentDto> studentDtoOptional = studentDtoSet.stream()
                .filter(studentDto -> studentDto.getEmail().equals(emaill))
                .findFirst();
        studentDtoOptional.ifPresent(studentDtoSet::remove);
    }
}
