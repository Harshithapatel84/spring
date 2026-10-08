<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Wine Information</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body { padding: 30px; }
        form { width: 500px; margin: auto; }
        h2 { margin-bottom: 25px; }
    </style>
</head>

<body>

<h2 class="text-center text-primary">Wine Information</h2>

<form action="wine" method="post">

    <div class="mb-3">
        <label class="form-label">Company Name</label>
        <input type="text" name="companyName" class="form-control" placeholder="Enter company name" value="${wineDto.companyName}">
    </div>

    <div class="mb-3">
        <label class="form-label">Manufacturing Date</label>
        <input type="date" name="mfgDate" class="form-control" value="${wineDto.mfgDate}">
    </div>

    <div class="mb-3">
        <label class="form-label">Manufacturing Name</label>
        <input type="text" name="mfgName" class="form-control" placeholder="Enter manufacturing name" value="${wineDto.mfgName}">
    </div>

    <div class="mb-3">
        <label class="form-label">Age</label>
        <input type="number" step="0.1" name="age" class="form-control" placeholder="Enter age" value="${wineDto.age}">
    </div>

    <button type="submit" class="btn btn-primary">Save</button>

    <div class="text-center mt-4 mb-4">
        <a href="index.jsp" class="btn btn-outline-primary">Home</a>
    </div>

    <h3 class="text-success">${message}</h3>

</form>

<c:forEach items="${validationErrors}" var="objectError">
    <p class="text-danger">${objectError.defaultMessage}</p>
</c:forEach>

</body>
</html>