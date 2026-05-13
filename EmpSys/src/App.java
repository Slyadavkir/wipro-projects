

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/wiproj2ee";
        String USERNAME = "root";
        String PASSWORD = "root";
        String query = "insert into employee(eid,ename,dept,salary) values(?,?,?,?)";

        try (Scanner s = new Scanner(System.in);
             Connection connobj = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connobj.prepareStatement(query)) {

            System.out.println("Enter employee details!");

            System.out.print("Enter name: ");
            String name = s.nextLine();

            System.out.print("Enter department: ");
            String dept = s.nextLine();

            System.out.print("Enter eid: ");
            int eid = s.nextInt();

            System.out.print("Enter salary: ");
            int salary = s.nextInt();

            statement.setInt(1, eid);
            statement.setString(2, name);
            statement.setString(3, dept);
            statement.setInt(4, salary);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee inserted successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}