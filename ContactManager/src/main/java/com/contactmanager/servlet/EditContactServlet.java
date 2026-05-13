package com.contactmanager.servlet;

import com.contactmanager.model.Contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/editContact")
public class EditContactServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");

        HttpSession session = request.getSession();
        List<Contact> contacts =
                (List<Contact>) session.getAttribute("contacts");

        Contact found = null;

        if (contacts != null) {
            for (Contact c : contacts) {
                if (c.getEmail().equals(email)) {
                    found = c;
                    break;
                }
            }
        }

        request.setAttribute("contact", found);
        request.getRequestDispatcher("edit.jsp")
               .forward(request, response);
    }
}