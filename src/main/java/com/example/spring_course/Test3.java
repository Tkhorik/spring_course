package com.example.spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("ApplicationContext4.xml");
        Person person = context.getBean("personBean",Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}