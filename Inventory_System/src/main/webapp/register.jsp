<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Inventory Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { padding: 30px; }
        form { width: 500px; margin: auto; }
        h2 { margin-bottom: 25px; }
    </style>
</head>
<body>
<h2 class="text-center text-primary">Inventory Information</h2>
<form action="inventory" method="post">

    <div class="mb-3">
        <label class="form-label">Name</label>
        <input type="text" name="name" class="form-control" placeholder="Enter name" value="${inventoryDTO.name}">
    </div>

    <div class="mb-3">
        <label class="form-label">Email</label>
        <input type="email" name="email" class="form-control" placeholder="Enter email" value="${inventoryDTO.email}">
    </div>

    <div class="mb-3">
        <label class="form-label">Phone Number</label>
        <input type="tel" name="phNo" class="form-control" placeholder="Enter phone number" value="${inventoryDTO.phNo}">
    </div>

    <div class="mb-3">
        <label class="form-label">Password</label>
        <input type="password" name="password" class="form-control" placeholder="Enter password">
    </div>

    <button type="submit" class="btn btn-primary">Save</button>
    <div class="text-center mt-4 mb-4">
        <a href="index.jsp" class="btn btn-outline-primary">Home</a>
    </div>
    <h3 class="text-success">${message}</h3>
</form>

<c:forEach items="${validationErrors}" var="objectError">
    <p class="text-danger text-center">${objectError.defaultMessage}</p>
</c:forEach>

</body>
</html>