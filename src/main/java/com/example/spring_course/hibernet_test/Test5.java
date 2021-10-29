package com.example.spring_course.hibernet_test;

import com.example.spring_course.hibernet_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("DELETE Employee " + "WHERE name = 'John'").executeUpdate();
            session.getTransaction().commit();
            System.out.println("DONE!");
        }finally {
            factory.close();
        }
    }

}
