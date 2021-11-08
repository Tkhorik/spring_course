package com.example.spring_course.hibernet.hibernet_one_to_many;

import com.example.spring_course.hibernet.hibernet_one_to_many.entity.Detail;
import com.example.spring_course.hibernet.hibernet_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1SetEmployee {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Alex", "Third", "IT", 1500);
            Detail detail = new Detail("Dallas", "123123", "112233@gmail.com");

            emp.setEmpDetail(detail);
            detail.setEmployee(emp);

            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println("DONE!");
        } finally {
            factory.close();
        }
    }
}
