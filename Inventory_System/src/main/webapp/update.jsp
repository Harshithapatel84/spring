<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update Details</title>
</head>
<body>

<h2>Update Register Details</h2>

<form action="${pageContext.request.contextPath}/register/update" method="post">

    <input type="hidden" name="id" value="${registerDto.id}">

    <label>Name:</label>
    <input type="text" name="name" value="${registerDto.name}">
    <br><br>

    <label>Email:</label>
    <input type="email" name="email" value="${registerDto.email}">
    <br><br>

    <label>Phone Number:</label>
    <input type="text" name="phNo" value="${registerDto.phNo}">
    <br><br>

    <label>Password:</label>
    <input type="password" name="password" value="${registerDto.password}">
    <br><br>

    <button type="submit">Update</button>

</form>

</body>
</html>