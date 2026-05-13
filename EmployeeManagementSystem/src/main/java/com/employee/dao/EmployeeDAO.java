package com.employee.dao;

import com.employee.entity.Employee;
import com.employee.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDAO {

    // Insert
    public void insertEmployee(Employee employee) {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.save(employee);

        tx.commit();
        session.close();

        System.out.println("Employee Inserted");
    }

    // Search
    public Employee searchEmployee(int id) {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        Employee emp =
                session.get(Employee.class, id);

        session.close();

        return emp;
    }

    // Update Salary
    public void updateSalary(int id, double salary) {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        Employee emp =
                session.get(Employee.class, id);

        if(emp != null) {

            emp.setEmpSalary(salary);

            session.update(emp);

            System.out.println("Salary Updated");
        }

        tx.commit();
        session.close();
    }

    // Delete
    public void deleteEmployee(int id) {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        Employee emp =
                session.get(Employee.class, id);

        if(emp != null) {

            session.delete(emp);

            System.out.println("Employee Deleted");
        }

        tx.commit();
        session.close();
    }

    // Display All
    public void displayAllEmployees() {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        List<Employee> list =
                session.createQuery("from Employee", Employee.class)
                        .list();

        for(Employee e : list) {
            System.out.println(e);
        }

        session.close();
    }
}