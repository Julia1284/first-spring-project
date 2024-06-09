package ru.yulialyapushkina.first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.yulialyapushkina.first_spring_project.service.CheckName;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "какой-то день!") String name) {
        name = CheckName.checkWeekDay(name);
        return String.format("Сегодня %s!", name);
    }
}
