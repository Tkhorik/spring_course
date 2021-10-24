package com.example.spring_course;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("person bean is created");
    }

    public Person(Pet pet) {
        this.pet = pet;
    }
    public void callYourPet()  {
        System.out.println("Hello!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("in class person pet was inserted");
        this.pet = pet;
    }
}
