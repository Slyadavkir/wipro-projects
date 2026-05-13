<%@ page import="com.contactmanager.model.Contact" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%
    Contact contact = (Contact) request.getAttribute("contact");

    if (contact == null) {
%>

<h3 style="text-align:center;color:red;">
    Contact not found
</h3>

<%
    return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Contact</title>

    <style>

        body{
            margin:0;
            font-family:Arial;
            background:linear-gradient(to right,#4f46e5,#7c3aed);
        }

        .navbar{
            background:#4f46e5;
            padding:15px;
            display:flex;
            justify-content:space-between;
            color:white;
        }

        .container{
            height:90vh;
            display:flex;
            justify-content:center;
            align-items:center;
        }

        .card{
            width:400px;
            background:white;
            padding:30px;
            border-radius:12px;
            box-shadow:0 4px 20px rgba(0,0,0,0.2);
        }

        input{
            width:100%;
            padding:10px;
            margin-bottom:12px;
            border:1px solid #ccc;
            border-radius:6px;
        }

        button{
            width:100%;
            padding:12px;
            background:#4f46e5;
            color:white;
            border:none;
            border-radius:6px;
            cursor:pointer;
        }

        button:hover{
            background:#3730a3;
        }

    </style>
</head>

<body>

<div class="navbar">
    <div>Contact Manager</div>
</div>

<div class="container">

    <div class="card">

        <h2 style="text-align:center;">Edit Contact</h2>

        <form action="updateContact" method="post" onsubmit="return validateEdit()">

            <input type="hidden" name="email"
                   value="<%= contact.getEmail() %>">

            <input type="text" name="name"
                   value="<%= contact.getName() %>" required>

            <input type="text" id="phone" name="phone"
                   value="<%= contact.getPhone() %>" required>

            <button type="submit">Update Contact</button>

        </form>

    </div>

</div>

<script>

function validateEdit() {

    let phone = document.getElementById("phone").value;

    if (!/^[0-9]{10}$/.test(phone)) {
        alert("Phone must be exactly 10 digits!");
        return false;
    }

    return true;
}

</script>

</body>
</html>