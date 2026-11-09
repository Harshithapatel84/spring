<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card mx-auto shadow p-4" style="max-width: 600px;">

        <h2 class="text-center text-primary mb-4">Welcome to Inventory Dashboard</h2>

        <h4 class="mb-3">Register Details</h4>

        <table class="table table-bordered table-striped">

            <tr>
                <th>Profile Image</th>
                <td>
                    <img src="${pageContext.request.contextPath}/register/displayImage?imageName=${registerDto.imageName}"
                         width="120" height="120"
                         alt="Profile Image"
                         style="object-fit: cover;">
                </td>
            </tr>

            <tr>
                <th>ID</th>
                <td>${registerDto.id}</td>
            </tr>

            <tr>
                <th>Name</th>
                <td>${registerDto.name}</td>
            </tr>

            <tr>
                <th>Email</th>
                <td>${registerDto.email}</td>
            </tr>

            <tr>
                <th>Phone Number</th>
                <td>${registerDto.phNo}</td>
            </tr>

        </table>

        <div class="d-flex justify-content-between mt-3">

            <a href="${pageContext.request.contextPath}/register/updateById?id=${registerDto.id}" class="btn btn-primary">
                Edit
            </a>

            <a href="${pageContext.request.contextPath}/register/logout" class="btn btn-danger">
                Logout
            </a>

        </div>

    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
