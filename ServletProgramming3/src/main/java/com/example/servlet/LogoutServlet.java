package com.example.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session != null) {
            session.invalidate();
        }

        response.setContentType("text/html");

        response.getWriter().println(
            "<html><body style='text-align:center;padding-top:100px;font-family:Arial;'>" +
            "<h2>Logged Out Successfully</h2>" +
            "<a href='login.html'>Login Again</a>" +
            "</body></html>"
        );
    }
}