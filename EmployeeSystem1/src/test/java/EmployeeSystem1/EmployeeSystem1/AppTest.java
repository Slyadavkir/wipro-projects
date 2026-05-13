package EmployeeSystem1.EmployeeSystem1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppTest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		System.out.println("Enter employee details!");
//		System.out.println("enter eid : ");
//		int eid = s.nextInt();
		
		AppTest t = new AppTest();
		//t.getEmployeeData(eid);
		t.getEmployees();
	}

	void getEmployeeData(int inputeid) {

		try {

			String query = "select * from EMPLOYEE where eid=" + inputeid;
			Connection conobj = DatabaseConn.getDB();
			Statement queryobj = conobj.createStatement();
			ResultSet data = queryobj.executeQuery(query);
			System.out.println("Employee data is fetched :");
			if (data.next()) {
				
				System.out.println("Name : " + data.getString("ename")); // database column name ename
				System.out.println("Eid : " + data.getInt("eid"));
				System.out.println("Salary : " + data.getInt("salary"));
				System.out.println("Department : " + data.getString(3)); // database column count number 3 is dept

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	void getEmployees() {

		List<Employee> list=new ArrayList<Employee>();
		try {

			String query = "select * from employee";
			Connection conobj = DatabaseConn.getDB();
			Statement queryobj = conobj.createStatement();
			ResultSet data = queryobj.executeQuery(query);
			while (data.next()) {
		
				   Employee obj=new Employee();
				     obj.setEid(data.getInt(1));
				     obj.setDept(data.getString(3));
				     obj.setEname(data.getString(2));
				     obj.setSalary(data.getInt(4));
				   list.add(obj);

			}
			for(Employee e:list)
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}