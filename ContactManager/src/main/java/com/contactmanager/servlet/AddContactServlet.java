package com.contactmanager.servlet;

import com.contactmanager.model.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addContact")
public class AddContactServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        HttpSession session = request.getSession();

        //  EMPTY FIELD CHECK
        if (name == null || phone == null || email == null ||
            name.trim().isEmpty() || phone.trim().isEmpty() || email.trim().isEmpty()) {

            session.setAttribute("message", "Error: All fields are required!");
            response.sendRedirect("index.jsp");
            return;
        }

        // PHONE VALIDATION (10 DIGITS ONLY)
        if (!phone.matches("\\d{10}")) {
            session.setAttribute("message", "Error: Phone must be exactly 10 digits!");
            response.sendRedirect("index.jsp");
            return;
        }

        //  EMAIL VALIDATION
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            session.setAttribute("message", "Error: Invalid email format!");
            response.sendRedirect("index.jsp");
            return;
        }

        List<Contact> contacts =
                (List<Contact>) session.getAttribute("contacts");

        if (contacts == null) {
            contacts = new ArrayList<>();
        }

        contacts.add(new Contact(name, phone, email));

        session.setAttribute("contacts", contacts);
        session.setAttribute("message", "Contact added successfully!");

        response.sendRedirect("contacts.jsp");
    }
}