package com.example.spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml");
        Cat cat = context.getBean("myLovelyPey2", Cat.class);
        cat.say();
    }
}
