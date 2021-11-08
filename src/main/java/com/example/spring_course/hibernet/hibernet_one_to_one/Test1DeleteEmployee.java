package com.example.spring_course.hibernet.hibernet_one_to_one;

import com.example.spring_course.hibernet.hibernet_one_to_one.entity.Detail;
import com.example.spring_course.hibernet.hibernet_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1DeleteEmployee {
    public static void main(String[] args) {
        Session session = null;
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 3);
            session.delete(emp);


            session.getTransaction().commit();
            System.out.println("DONE!");
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}
