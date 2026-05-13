package com.employee.main;

import com.employee.dao.EmployeeDAO;
import com.employee.entity.Employee;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeDAO dao = new EmployeeDAO();

        // Insert
        Employee emp = new Employee(
                101,
                "Rahul",
                "IT",
                50000,
                "rahul@gmail.com"
        );

        dao.insertEmployee(emp);

        // Search
        System.out.println(dao.searchEmployee(101));

        // Update
        dao.updateSalary(101, 70000);

        // Display
        dao.displayAllEmployees();

        // Delete
       // dao.deleteEmployee(101);
    }
}