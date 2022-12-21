package com.guney.demo.propertiesdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose "/teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + "\n" + "Team Name: " + teamName;
    }

    // expose "/" that return "Hello World
    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is:  " + LocalDateTime.now();
    }
}
