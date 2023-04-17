package com.naumen.WebApp.controller;

import com.naumen.WebApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/age/{name}")
    public ResponseEntity<Integer> getAge(@PathVariable String name) throws IOException {
        int age = personService.getAge(name);
        return ResponseEntity.ok(age);
    }

    @GetMapping("/frequencies")
    public ResponseEntity<Map<String, Integer>> getFrequencies() {
        Map<String, Integer> frequencies = personService.getFrequencies();
        return ResponseEntity.ok(frequencies);
    }

    @GetMapping("/max-age")
    public ResponseEntity<Map<String, Integer>> getNameWithMaxAge() {
        Map<String, Integer> nameWithMaxAge = personService.getNameAndMaxAge();
        return ResponseEntity.ok(nameWithMaxAge);
    }
}

