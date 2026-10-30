<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<h2>Welcome to Inventory Dashboard</h2>

<h3>Register Details</h3>

<table border="1" cellpadding="10">

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

<br>

<a href="${pageContext.request.contextPath}/register/updateById?id=${registerDto.id}">
    Edit
</a>

</body>
</html>