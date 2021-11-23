package com.example.spring_course.hibernet.hibernet_one_to_many;


import com.example.spring_course.hibernet.hibernet_one_to_many.entity.Child;
import com.example.spring_course.hibernet.hibernet_one_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg2.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {

            session = factory.getCurrentSession();
            /*first*/
            Section session1 = new Section("FirstSection");
//            Section session2 = new Section("secondSection");
//            Section session3 = new Section("ThirdSection");
            Child child1 = new Child("first", 2);
            Child child2 = new Child("second", 3);
            Child child3 = new Child("third", 5);

            session.beginTransaction();
            session.save(child1);
            session.save(child2);
            session.save(child3);

//            session1.addChildeToSection(child1);
//            session1.addChildeToSection(child2);
//            session1.addChildeToSection(child3);
//            session2.addChildeToSection(child3);
//            session2.addChildeToSection(child3);
//            session1.addChildeToSection(child3);
//            session3.addChildeToSection(child3);
//            session3.addChildeToSection(child2);
//            session3.addChildeToSection(child2);




            session.getTransaction().commit();
//            session.persist(session2);
//            session.getTransaction().commit();
//            session.persist(session3);
//            session.getTransaction().commit();

            /*second*/

            /*third*/

            System.out.println("DONE!");
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}
