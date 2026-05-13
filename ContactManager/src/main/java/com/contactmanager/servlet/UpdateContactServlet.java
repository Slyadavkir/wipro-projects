package com.contactmanager.servlet;

import com.contactmanager.model.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/updateContact")
public class UpdateContactServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");

        HttpSession session = request.getSession();

        // ❌ VALIDATION
        if (!phone.matches("\\d{10}")) {
            session.setAttribute("message", "Error: Phone must be exactly 10 digits!");
            response.sendRedirect("contacts.jsp");
            return;
        }

        List<Contact> contacts =
                (List<Contact>) session.getAttribute("contacts");

        if (contacts == null) {
            session.setAttribute("message", "Error: No contacts found!");
            response.sendRedirect("contacts.jsp");
            return;
        }

        boolean found = false;

        for (Contact c : contacts) {
            if (c.getEmail().equals(email)) {
                c.setName(name);
                c.setPhone(phone);
                found = true;
                break;
            }
        }

        if (found) {
            session.setAttribute("message", "Contact updated successfully!");
        } else {
            session.setAttribute("message", "Error: Contact not found!");
        }

        response.sendRedirect("contacts.jsp");
    }
}