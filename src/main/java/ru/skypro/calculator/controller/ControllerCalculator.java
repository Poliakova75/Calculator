package ru.skypro.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calculator")
public class ControllerCalculator {
    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String addNumbers(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }
    @GetMapping("/minus")
    public String subtractNumbers(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
    @GetMapping("/multiply")
    public String multiplyNumbers(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/divide")
    public String divideNumbers(@RequestParam int num1, @RequestParam int num2) {
        if (num2 != 0) {
            int result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        } else {
            return "Деление на ноль недопустимо";
        }
    }
}

