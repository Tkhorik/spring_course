package com.example.spring_course.hibernet_test;

import com.example.spring_course.hibernet_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Employee emp = new Employee("John", "Ivanov", "HR", 100);
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        System.out.println("DONE!");
    }
}
