
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Wine Update</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body { padding: 30px; }
        form { width: 500px; margin: auto; }
        h2 { margin-bottom: 25px; }
    </style>
</head>

<body>

<h2 class="text-center text-primary">Wine Information</h2>

<form action="${pageContext.request.contextPath}/wine/wineUpdate"
      method="post">

    <input type="hidden" name="id" value="${wineDto.id}">

    <div class="mb-3">
        <label class="form-label">Company Name</label>
        <input type="text" name="companyName"
               class="form-control"
               value="${wineDto.companyName}">
    </div>

    <div class="mb-3">
        <label class="form-label">Manufacturing Date</label>
        <input type="date" name="mfgDate"
               class="form-control"
               value="${wineDto.mfgDate}">
    </div>

    <div class="mb-3">
        <label class="form-label">Manufacturing Name</label>
        <input type="text" name="mfgName"
               class="form-control"
               value="${wineDto.mfgName}">
    </div>

    <div class="mb-3">
        <label class="form-label">Age</label>
        <input type="number" step="0.1" name="age"
               class="form-control"
               value="${wineDto.age}">
    </div>

    <button type="submit" class="btn btn-primary">Update</button>

    <a href="${pageContext.request.contextPath}/index.jsp"
       class="btn btn-outline-primary">Home</a>

    <p class="text-success mt-3">${updateMessage}</p>
    <p class="text-danger">${error}</p>

    <c:forEach items="${validationErrors}" var="objectError">
        <p class="text-danger">${objectError.defaultMessage}</p>
    </c:forEach>

</form>

</body>
</html>