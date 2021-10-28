package com.example.spring_course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean",Person.class);

        person.callYourPet();
        context.close();

    }
}
