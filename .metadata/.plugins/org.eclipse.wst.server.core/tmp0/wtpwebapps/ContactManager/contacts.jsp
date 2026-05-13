<%@ page import="java.util.List" %>
<%@ page import="com.contactmanager.model.Contact" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>My Contacts</title>

    <style>

        body{
            margin:0;
            font-family:Arial;
            background:#f4f4f4;
        }

        .navbar{
            background:#4f46e5;
            padding:15px;
            display:flex;
            justify-content:space-between;
            color:white;
        }

        .nav-links a{
            color:white;
            margin-left:15px;
            gap:50px
            text-decoration:none;
        }

        .container{
            display:flex;
            justify-content:center;
            margin-top:40px;
        }

        .card{
            width:800px;
            background:white;
            padding:25px;
            border-radius:10px;
        }

        table{
            width:100%;
            border-collapse:collapse;
        }

        th{
            background:#4f46e5;
            color:white;
            padding:12px;
        }

        td{
            padding:12px;
            border-bottom:1px solid #ddd;
        }

        .btn{
            padding:5px 10px;
            color:white;
            border:none;
            border-radius:4px;
            text-decoration:none;
            margin-right:8px;   
        }

        .edit{ background:orange; }
        .delete{ background:red; }

        .msg{
            text-align:center;
            color:green;
            margin-bottom:10px;
        }

        .empty{
            text-align:center;
            color:gray;
            padding:20px;
        }

    </style>
</head>

<body>

<!-- NAVBAR -->
<div class="navbar">
    <div>Contact Manager</div>

    <div class="nav-links">
        <a href="index.jsp">Home</a>
        <a href="contacts.jsp">Contacts</a>
    </div>
</div>

<div class="container">

    <div class="card">

        <h2 style="text-align:center;">My Contacts</h2>
        <%
            String msg = (String) session.getAttribute("message");
            if (msg != null) {
        %>

        <div style="color:green;text-align:center;margin-bottom:10px;">
            <%= msg %>
        </div>

        <%
            session.removeAttribute("message");
            }
        %>

        <%
            List<Contact> contacts =
                    (List<Contact>) session.getAttribute("contacts");

            if (contacts == null || contacts.isEmpty()) {
        %>

        <div class="empty">
            No contacts added yet
        </div>

        <%
            } else {
        %>

        <table>

            <tr>
                <th>Name</th>
                <th>Phone</th>
                <th>Email</th>
                <th>Actions</th>
            </tr>

            <%
                for (Contact c : contacts) {
            %>

            <tr>
                <td><%= c.getName() %></td>
                <td><%= c.getPhone() %></td>
                <td><%= c.getEmail() %></td>

                <td>
                    <a class="btn edit"
                       href="editContact?email=<%= c.getEmail() %>">
                        Edit
                    </a>

                    <a class="btn delete"
                       href="deleteContact?email=<%= c.getEmail() %>">
                        Delete
                    </a>
                </td>
            </tr>

            <%
                }
            %>

        </table>

        <%
            }
        %>

    </div>

</div>

</body>
</html>