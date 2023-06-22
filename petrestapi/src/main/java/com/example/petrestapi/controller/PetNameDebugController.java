package com.example.petrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetNameDebugController {

    @GetMapping("/name")
    public List<String> getName() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello i: " + i);
        }
        return List.of("ALBA", "VANILLA");
    }

}
