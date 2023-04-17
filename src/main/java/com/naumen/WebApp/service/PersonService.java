package com.naumen.WebApp.service;

import com.naumen.WebApp.model.Person;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.*;

@Service
public class PersonService {
    private Map<String, Person> personMap = new HashMap<>();
    Map<String, Integer> frequencies = new HashMap<>();

    @PostConstruct
    public void init() throws IOException {
        File file = new File("persons.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("_");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    personMap.put(name, new Person(name, age));
                }
            }
        }
    }

    public int getAge(String name) {
        Person person = personMap.get(name);
        if (person != null) {
            person.incrementCounter();
            return person.getAge();
        } else {
            int age = new Random().nextInt(90) + 1;
            personMap.put(name, new Person(name, age));
            return age;
        }
    }

    public Map<String, Integer> getFrequencies() {
        for (Person person : personMap.values()) {
            String name = person.getName();
            frequencies.put(name, frequencies.getOrDefault(name, 0) + person.getCounter());
            person.resetCounter();
        }
        return frequencies;
    }

    public Map<String, Integer> getNameAndMaxAge() {
        String name = "";
        int maxAge = 0;
        for (Person person : personMap.values()) {
            if (person.getAge() > maxAge) {
                name = person.getName();
                maxAge = person.getAge();
            }
        }
        Map<String, Integer> result = new HashMap<>();
        result.put(name, maxAge);
        return result;
    }
}
