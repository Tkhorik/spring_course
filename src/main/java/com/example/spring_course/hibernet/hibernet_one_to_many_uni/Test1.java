package com.example.spring_course.hibernet.hibernet_one_to_many_uni;


import com.example.spring_course.hibernet.hibernet_one_to_many_uni.entity.Department;
import com.example.spring_course.hibernet.hibernet_one_to_many_uni.entity.Employee;
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
            /*first*/
/*            Department dep = new Department("ITw", 300, 1200);
            Employee employee1 = new Employee("Test12Name", "test2Surname", 500);
            Employee employee2 = new Employee("Test22Name", "test3Surname", 1500);

            dep.addEmployeeToDepartment(employee1);
            dep.addEmployeeToDepartment(employee2);session.beginTransaction();
            session.save(dep);*/

            /*second*/
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
            /*third*/
//            session.beginTransaction();
//            Employee employee =session.get(Employee.class,1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

            session.beginTransaction();
            Department dep = session.get(Department.class,2);
//            Employee emp = session.get(Employee.class,1); //delete for employee dows not delet his department there fore it in ui direction relation
            session.delete(dep);// delete for department deletes all his employees
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
