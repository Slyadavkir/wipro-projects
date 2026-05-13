package com.wipro.ORMDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.ORMDemo.entity.Employee;

@Repository
public class EmployeeDaoImpl {

    @Autowired
    private SessionFactory sessionFactory;

    // GET ALL EMPLOYEES
    public void getAllEmployees() {

        Session session = sessionFactory.openSession();

        String sql = "SELECT * FROM employee";

        List<Employee> list =
                session.createNativeQuery(sql, Employee.class).list();

        for (Employee e : list) {

            System.out.println(
                    e.getId() + " "
                  + e.getName() + " "
                  + e.getSalary());
        }

        session.close();
    }

    // INSERT
    public void insertEmployee(Employee emp) {

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(emp);

        tx.commit();

        session.close();

        System.out.println("Employee Inserted Successfully");
    }

    // UPDATE
    public void updateEmployee(double salary, int empid) {

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        String sql =
                "UPDATE employee SET salary = :salary WHERE id = :empId";

        NativeQuery query = session.createNativeQuery(sql);

        query.setParameter("salary", salary);
        query.setParameter("empId", empid);

        int rows = query.executeUpdate();

        tx.commit();

        session.close();

        if (rows > 0) {
            System.out.println("Employee Updated Successfully");
        } else {
            System.out.println("Employee Not Found");
        }
    }

    // DELETE
    public void deleteEmployee(int empid) {

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        String sql = "DELETE FROM employee WHERE id = :id";

        NativeQuery query =
                session.createNativeQuery(sql);

        query.setParameter("id", empid);

        int rows = query.executeUpdate();

        tx.commit();

        session.close();

        if (rows > 0) {
            System.out.println("Employee Deleted Successfully");
        } else {
            System.out.println("Employee Not Found");
        }
    }
}