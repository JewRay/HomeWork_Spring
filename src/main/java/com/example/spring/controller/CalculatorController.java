package com.example.spring.controller;


import com.example.spring.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }


    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Number a,
                       @RequestParam(value = "num2", required = false) Number b) {
        if (a == null) {
            return "Не задан первый параметр";
        }
        if (b == null) {
            return "Не задан второй параметр";
        }
        return a + " + " + b + " = " + calculatorService.plus(a, b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Number a,
                        @RequestParam(value = "num2", required = false) Number b) {
        if (a == null) {
            return "Не задан первый параметр";
        }
        if (b == null) {
            return "Не задан второй параметр";
        }
        return a + " - " + b + " = " + calculatorService.minus(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Number a,
                           @RequestParam(value = "num2", required = false) Number b) {
        if (a == null) {
            return "Не задан первый параметр";
        }
        if (b == null) {
            return "Не задан второй параметр";
        }
        return a + " * " + b + " = " + calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Number a,
                         @RequestParam(value = "num2", required = false) Number b) {
        if (a == null) {
            return "Не задан первый параметр";
        }
        if (b == null) {
            return "Не задан второй параметр";
        }
        if (b.intValue() == 0) {
            return "<h2>На ноль делить нельзя </h2>";
        }
        return a + " / " + b + " = " + calculatorService.divide(a, b);
    }


}
