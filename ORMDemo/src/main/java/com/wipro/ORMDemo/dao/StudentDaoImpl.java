package com.wipro.ORMDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.ORMDemo.entity.Student;

@Repository
public class StudentDaoImpl {

    @Autowired
    private SessionFactory sessionFactory;

    // INSERT
    public void insertStudent(Student student) {

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(student);

        tx.commit();

        session.close();

        System.out.println("Student Inserted Successfully");
    }

    // SELECT
    public void getAllStudents() {

        Session session = sessionFactory.openSession();

        String sql = "SELECT * FROM student";

        List<Student> list =
                session.createNativeQuery(sql, Student.class).list();

        for (Student s : list) {

            System.out.println(
                    s.getRollno() + " "
                  + s.getName() + " "
                  + s.getEmail());
        }

        session.close();
    }

    // UPDATE
    public void updateStudent(String email, int rollno) {

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        String sql =
                "UPDATE student SET email=:email WHERE rollno=:rollno";

        NativeQuery query =
                session.createNativeQuery(sql);

        query.setParameter("email", email);
        query.setParameter("rollno", rollno);

        int rows = query.executeUpdate();

        tx.commit();

        session.close();

        if (rows > 0) {
            System.out.println("Student Updated Successfully");
        } else {
            System.out.println("Student Not Found");
        }
    }

    // DELETE
    public void deleteStudent(int rollno) {

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        String sql =
                "DELETE FROM student WHERE rollno=:rollno";

        NativeQuery query =
                session.createNativeQuery(sql);

        query.setParameter("rollno", rollno);

        int rows = query.executeUpdate();

        tx.commit();

        session.close();

        if (rows > 0) {
            System.out.println("Student Deleted Successfully");
        } else {
            System.out.println("Student Not Found");
        }
    }
}