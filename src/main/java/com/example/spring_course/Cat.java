package com.example.spring_course;

public class Cat implements Pet {
    public Cat() {
        System.out.println("cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Mew-miu!");
    }
}
