package com.example.functionprogramming.controller;

import com.example.functionprogramming.general.CalculatorInterface;
import com.example.functionprogramming.general.ProcessFunctions;
import com.example.functionprogramming.general.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.example.functionprogramming.general.Student.getStudentInfo;

@Slf4j
@RestController
@RequestMapping("/fb")
public class FunctionProgramingController {

    private final CalculatorInterface calculator;

    @Autowired
    public FunctionProgramingController(CalculatorInterface calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/print/{num}")
    public void functionalProgrammingOneArgumentApi(@PathVariable int num) {
        Integer addedNumber = ProcessFunctions.processIntFunction(intValue -> calculator.addOne(num), num);
        log.info("{}", addedNumber);

        Integer subtractedNumber = ProcessFunctions.processIntFunction(calculator::subtractOne, num);
        log.info("{}", subtractedNumber);

        Float dividedNumber = ProcessFunctions.processFloatedIntFunction(calculator::divideByTwo, num);
        log.info("{}", dividedNumber);
    }

    @GetMapping("/print/{num1}/{num2}")
    public void functionalProgrammingTwoArgumentApi(@PathVariable int num1, @PathVariable int num2) {
        int addedNumber = ProcessFunctions.processToIntBiFunction(
                (numValue1, numValue2) -> calculator.add(num1, num2), num1, num2);
        log.info("{}", addedNumber);

        int subtractedNumber = ProcessFunctions.processToIntBiFunction(calculator::subtract, num1, num2);
        log.info("{}", subtractedNumber);

        int multipliedNumber = ProcessFunctions.processToIntBiFunction(calculator::multiply, num1, num2);
        log.info("{}", multipliedNumber);

        double dividedNumber = ProcessFunctions.processFloatedBiFunction(calculator::divide, num1, num2);
        log.info("{}", dividedNumber);
    }

    @GetMapping("/print")
    public void functionalProgrammingTwoArgumentApi() {
        int five = ProcessFunctions.processIntSupplier(() -> calculator.getFive());
        log.info("{}", five);

        int ten = ProcessFunctions.processIntSupplier(calculator::getTen);
        log.info("{}", ten);
    }

    @GetMapping("/print/student")
    public void getStudentInfoApi(@RequestBody Student studentDto) {
        String studentName = getStudentInfo(student -> Student.getStudentName(student), studentDto);
        log.info("{}", studentName);

        String studentEmail = getStudentInfo(Student::getStudentEmail, studentDto);
        log.info("{}", studentEmail);
    }
}
