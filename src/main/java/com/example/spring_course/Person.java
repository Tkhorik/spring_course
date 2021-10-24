package com.example.spring_course;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

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
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
