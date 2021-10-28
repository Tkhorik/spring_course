package com.example.spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigureWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());
    }
}
