package EmployeeSystem1.EmployeeSystem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter employee details!");
		System.out.println("enter new  name tpo be updated : ");
		String name = s.next();
		System.out.println("enter deparment : ");
		String dept = s.next();
		System.out.println("enter eid : ");
		int eid = s.nextInt();
		System.out.println("enter salary : ");
		int salary = s.nextInt();

		Employee e1 = new Employee();
		e1.setDept(dept);
		e1.setEid(eid);
		e1.setEname(name);
		e1.setSalary(salary);

		// System.out.println(e1);
		String URL = "jdbc:oracle:thin:@localhost:1521/FREEPDB1"; // Service Name
//		String URL = "jdbc:mysql.://localhost:3306/wiproj2ee";  // "jdbc:oracle:thin:@localhost:1521:xe";
		String USERNAME = "system";
		String PASSWORD = "Oracle123";
		String query = "insert into EMPLOYEE values(?,?,?,?)";

		try {
			// Load Driver (optional in newer versions)
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Class.forName("com.mysql.cj.jdbc.Driver"); // step 1
			Connection connobj = DriverManager.getConnection(URL, USERNAME, PASSWORD); // step2
			PreparedStatement statement = connobj.prepareStatement(query);
			statement.setInt(1, eid);
			statement.setString(2, name);
			statement.setString(3, dept);
			statement.setInt(4, salary);
			
			statement.executeUpdate();// executing the query

		} catch (Exception e) {
			System.out.println(e);
		}
		// mention Drive package
		// DriverMnager
		// Create database connection using driver
		// execute query using statement/preparestatement
		// resultset or output

	}
}