
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card p-4 mx-auto shadow" style="max-width: 400px;">
        <h3 class="text-center mb-4">Login Form</h3>

        <form action="${pageContext.request.contextPath}/register/login" method="post" autocomplete="off">

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email" class="form-control" placeholder="Enter email" autocomplete="off" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" name="password" class="form-control" placeholder="Enter password" autocomplete="new-password" required>
            </div>

            <button type="submit" class="btn btn-primary w-100">Login</button>

            <p class="text-danger text-center mt-3">${msg}</p>
        </form>
    </div>
</div>

</body>
</html>
