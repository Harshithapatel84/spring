<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow p-4 mx-auto" style="max-width: 500px;">

        <h3 class="text-center text-primary mb-4">Update Register Details</h3>

        <form action="${pageContext.request.contextPath}/register/update" method="post" enctype="multipart/form-data">

            <input type="hidden" name="id" value="${registerDto.id}">

            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" name="name" value="${registerDto.name}" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email" value="${registerDto.email}" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Phone Number</label>
                <input type="text" name="phNo" value="${registerDto.phNo}" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Profile Image</label>
                <input type="file" name="file" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">New Password</label>
                <input type="password" name="password" class="form-control" placeholder="Enter new password if changing">
            </div>

            <button type="submit" class="btn btn-success w-100">Update</button>

        </form>

    </div>
</div>

</body>
</html>