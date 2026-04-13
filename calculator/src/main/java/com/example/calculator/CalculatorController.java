package com.example.calculator;

import org.springframework.web.bind.annotation.*;

// Аннотация @RestController говорит Spring: "Этот класс обрабатывает HTTP-запросы"
@RestController
@RequestMapping("/api") // Все методы внутри будут доступны по адресу /api/...
public class CalculatorController {

    // Метод сложения
    // Доступен по URL: /api/add?a=10&b=20
    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    // Метод вычитания
    // Доступен по URL: /api/sub?a=10&b=20
    @GetMapping("/sub")
    public double sub(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    // Метод умножения
    @GetMapping("/mul")
    public double mul(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    // Метод деления
    @GetMapping("/div")
    public double div(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }
    
    // Проверка работоспособности (Health Check)
    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}