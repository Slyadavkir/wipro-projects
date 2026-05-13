package com.example.servlet;

import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Users")
public class UserListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        try {
            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            response.getWriter().println(
                "<html><head><style>" +
                "body{font-family:Arial;background:#f4f4f4;padding:40px;}" +
                "table{border-collapse:collapse;width:60%;margin:auto;background:white;}" +
                "th,td{padding:12px;border:1px solid #ddd;text-align:center;}" +
                "th{background:#4facfe;color:white;}" +
                "h2{text-align:center;}" +
                "</style></head><body>"
            );

            response.getWriter().println("<h2>Users List</h2>");
            response.getWriter().println("<table>");
            response.getWriter().println("<tr><th>ID</th><th>Username</th><th>Password</th></tr>");

            while (rs.next()) {
                response.getWriter().println(
                    "<tr>" +
                    "<td>" + rs.getInt("id") + "</td>" +
                    "<td>" + rs.getString("username") + "</td>" +
                    "<td>" + rs.getString("password") + "</td>" +
                    "</tr>"
                );
            }

            response.getWriter().println("</table>");

            response.getWriter().println(
                "<div style='text-align:center;margin-top:20px;'>" +
                "<a href='Demo'>Back</a>" +
                "</div>"
            );

            response.getWriter().println("</body></html>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}