<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Contact Manager</title>

    <style>

        body{
            margin:0;
            padding:0;
            font-family:Arial,sans-serif;
            background:linear-gradient(to right,#4f46e5,#7c3aed);
        }

        .navbar{
            background:#4f46e5;
            padding:15px 30px;
            display:flex;
            justify-content:space-between;
            align-items:center;
            color:white;
        }

        .logo{
            font-size:22px;
            font-weight:bold;
        }

        .nav-links a{
            color:white;
            margin-left:20px;
            text-decoration:none;
            font-weight:bold;
        }

        .main-container{
            height:90vh;
            display:flex;
            justify-content:center;
            align-items:center;
        }

        .card{
            width:420px;
            background:white;
            padding:30px;
            border-radius:12px;
            box-shadow:0 4px 20px rgba(0,0,0,0.2);
        }

        .input-group{
            margin-bottom:15px;
        }

        input{
            width:100%;
            padding:10px;
            border:1px solid #ccc;
            border-radius:6px;
        }

        .btn{
            width:100%;
            padding:12px;
            background:#4f46e5;
            color:white;
            border:none;
            border-radius:6px;
            cursor:pointer;
        }

        .btn:hover{
            background:#3730a3;
        }

        .toggle-btn{
            width:100%;
            padding:12px;
            background:#10b981;
            color:white;
            border:none;
            border-radius:6px;
            cursor:pointer;
            margin-top:10px;
        }

    </style>
</head>

<body>

<div class="navbar">
    <div class="logo">Contact Manager</div>

    <div class="nav-links">
        <a href="index.jsp">Home</a>
        <a href="contacts.jsp">Contacts</a>
    </div>
</div>

<div class="main-container">

    <div class="card">

        <h2 style="text-align:center;">Contact Manager</h2>

        <!-- TOGGLE BUTTON -->
        <button class="toggle-btn" onclick="toggleForm()">
            + Add Contact
        </button>

        <!-- FORM -->
        <div id="formBox" style="display:none; margin-top:15px;">

            <form action="addContact" method="post" onsubmit="return validateForm()">

                <div class="input-group">
                    <input type="text" name="name" placeholder="Name" required>
                </div>

                <div class="input-group">
                    <input type="text" id="phone" name="phone" placeholder="Phone" required>
                </div>

                <div class="input-group">
                    <input type="email" id="email" name="email" placeholder="Email" required>
                </div>

                <button class="btn" type="submit">Save Contact</button>

            </form>

        </div>

    </div>

</div>

<script>

function toggleForm() {
    let box = document.getElementById("formBox");

    if (box.style.display === "none" || box.style.display === "") {
        box.style.display = "block";
    } else {
        box.style.display = "none";
    }
}

// validation
function validateForm() {

    let phone = document.getElementById("phone").value;
    let email = document.getElementById("email").value;

    if (!/^[0-9]{10}$/.test(phone)) {
        alert("Phone must be exactly 10 digits!");
        return false;
    }

    if (!/^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$/.test(email)) {
        alert("Invalid email format!");
        return false;
    }

    return true;
}

</script>

</body>
</html>