package com.wipro.ORMDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.ORMDemo.dao.StudentDaoImpl;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        StudentDaoImpl dao =
                context.getBean(StudentDaoImpl.class);

        // SELECT
        dao.getAllStudents();
    }
}