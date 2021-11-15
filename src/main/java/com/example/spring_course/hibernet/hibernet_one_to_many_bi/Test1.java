package com.example.spring_course.hibernet.hibernet_one_to_many_bi;


import com.example.spring_course.hibernet.hibernet_one_to_many_bi.entity.Department;
import com.example.spring_course.hibernet.hibernet_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg2.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {

            session = factory.getCurrentSession();

//            Department dep = new Department("IT", 300, 1200);
//            Employee employee1 = new Employee("Test1Name", "test2Surname", 500);
//            Employee employee2 = new Employee("Test2Name", "test3Surname", 1500);
//
//            dep.addEmployeeToDepartment(employee1);
//            dep.addEmployeeToDepartment(employee2);

            session.beginTransaction();
            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmps());


//            session.save(dep);
            System.out.println("DONE!");
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}
