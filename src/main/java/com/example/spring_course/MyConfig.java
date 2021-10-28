package com.example.spring_course;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("com.example.spring_course")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();


    }
    @Bean
    public  Person personBean(){
        return new Person(catBean());
    }
}
