package com.example.spring.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Number plus(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    public Number minus(Number a, Number b) {
        return a.doubleValue() - b.doubleValue();
    }

    public Number multiply(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    public Number divide(Number a, Number b) {
        return a.doubleValue() / b.doubleValue();
    }
}
