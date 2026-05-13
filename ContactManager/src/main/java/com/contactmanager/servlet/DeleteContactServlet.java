package com.contactmanager.servlet;

import com.contactmanager.model.Contact;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

@WebServlet("/deleteContact")
public class DeleteContactServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException {

        String email = request.getParameter("email");

        HttpSession session = request.getSession();

        List<Contact> contacts =
                (List<Contact>) session.getAttribute("contacts");

        if (contacts != null && email != null) {

            Iterator<Contact> it = contacts.iterator();

            while (it.hasNext()) {

                Contact c = it.next();

                //  MATCH EXACT EMAIL
                if (c.getEmail().equals(email)) {
                    it.remove();  
                    break;         
                }
            }

            session.setAttribute("contacts", contacts);
            session.setAttribute("message", "Contact deleted successfully!");
        } else {
            session.setAttribute("message", "Error: Contact not found!");
        }

        response.sendRedirect("contacts.jsp");
    }
}