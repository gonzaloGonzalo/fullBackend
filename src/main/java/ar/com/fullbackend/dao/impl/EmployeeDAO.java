package ar.com.fullbackend.dao.impl;

import ar.com.fullbackend.dto.Employee;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by computer on 20/03/17.
 */
public class EmployeeDAO {

    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration
                .buildSessionFactory(builder.build());
        return sessionFactory;
    }

    public static Integer create(Employee e) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created " + e.toString());
        return e.getId();

    }

    public static List<Employee> read() {
        Session session = getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Employee> employees = session.createQuery("FROM Employee").list();
        session.close();
        System.out.println("Found " + employees.size() + " Employees");
        return employees;

    }

    public static void update(Employee e) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Employee em = (Employee) session.load(Employee.class, e.getId());

        em.setId(e.getId());
        em.setFirstName(e.getFirstName());
        em.setLastName(e.getLastName());
        em.setSalary(e.getSalary());

        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully updated " + e.toString());

    }

    public static void delete(Integer id) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Employee e = findByID(id);
        session.delete(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully deleted " + e.toString());

    }

    public static Employee findByID(Integer id) {
        Session session = getSessionFactory().openSession();
        Employee e = (Employee) session.load(Employee.class, id);
        session.close();
        return e;
    }

    public static void deleteAll() {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Employee ");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully deleted all employees.");

    }
}
