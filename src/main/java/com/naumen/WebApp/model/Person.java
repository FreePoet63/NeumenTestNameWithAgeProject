package com.naumen.WebApp.model;

public class Person {
    private String name;
    private int age;
    private int counter = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void incrementCounter() {
        counter++;
    }

    public void resetCounter() {
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
