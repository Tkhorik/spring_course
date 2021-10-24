package com.example.spring_course;

public class Dog implements Pet {
    public Dog() {
        System.out.println("dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("bow-wow!");

    }
}
