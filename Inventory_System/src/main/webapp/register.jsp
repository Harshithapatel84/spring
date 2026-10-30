<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Register</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            background-color: #f3f6fb;
            padding: 40px 15px;
        }

        form {
            max-width: 390px;
            margin: auto;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.08);
        }

        h2 {
            margin-bottom: 25px;
        }

        .btn-primary {
            background-color: #2457c5;
            border-color: #2457c5;
        }

        .btn-primary:hover {
            background-color: #19449f;
            border-color: #19449f;
        }

        #EmailError {
            display: block;
            margin-top: 5px;
        }
    </style>
</head>

<body>

<h2 class="text-center text-primary">Create Account</h2>

<form action="${pageContext.request.contextPath}/register"
      method="post" autocomplete="off">

    <div class="mb-3">
        <label class="form-label">Full Name</label>
        <input type="text"
               name="name"
               class="form-control"
               placeholder="Enter your name"
               value="${inventoryDTO.name}"
               autocomplete="off"
               required>
    </div>

    <div class="mb-3">
        <label class="form-label">Email Address</label>
        <input type="email"
               id="email"
               name="email"
               class="form-control"
               placeholder="Enter your email"
               value="${inventoryDTO.email}"
               autocomplete="off"
               onblur="checkEmailExit()"
               required>

        <span id="EmailError" class="small"></span>
    </div>

    <div class="mb-3">
        <label class="form-label">Phone Number</label>
        <input type="tel"
               name="phNo"
               class="form-control"
               placeholder="Enter phone number"
               value="${inventoryDTO.phNo}"
               autocomplete="off"
               required>
    </div>

    <div class="mb-3">
        <label class="form-label">Password</label>
        <input type="password"
               name="password"
               class="form-control"
               placeholder="Create a password"
               autocomplete="new-password"
               required>
    </div>

    <button type="submit" class="btn btn-primary w-100">
        Register
    </button>

    <div class="text-center mt-3">
        <a href="${pageContext.request.contextPath}/index.jsp"
           class="btn btn-outline-primary">
            Home
        </a>
    </div>

    <p class="text-success text-center mt-3">${message}</p>

    <c:forEach items="${validationErrors}" var="objectError">
        <p class="text-danger text-center mb-1">
            ${objectError.defaultMessage}
        </p>
    </c:forEach>

</form>

<script>

function checkEmailExit() {

    const emailId = document.getElementById("email").value.trim();
    const emailError = document.getElementById("EmailError");

    if (emailId === "") {
        emailError.innerText = "";
        return;
    }

    console.log("Email entered:", emailId);

    const url =
        "${pageContext.request.contextPath}/api/inventory/checkEmailExist/"
        + encodeURIComponent(emailId);

    console.log("Request URL:", url);

    const request = new XMLHttpRequest();
    request.open("GET", url, true);

    request.onload = function () {

        console.log("HTTP Status:", request.status);
        console.log("Server Response:", request.responseText);

        if (request.status === 200) {
            const message = request.responseText.trim();

            document.getElementById("EmailError").innerText = message;

            if (message === "Email already exists") {
                document.getElementById("EmailError").style.color = "red";
            } else {
                document.getElementById("EmailError").style.color = "green";
            }
        } else {
            console.log("HTTP Status:", request.status);
            console.log("Server Response:", request.responseText);

            document.getElementById("EmailError").innerText =
                "Unable to check email.";
        }
    };

    request.onerror = function () {
        console.log("Request failed. Check server connection.");
    };

    request.send();
}
</script>

</body>
</html>