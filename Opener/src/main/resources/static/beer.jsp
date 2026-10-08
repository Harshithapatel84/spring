
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Beer Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { padding: 30px; }
        form { width: 500px; margin: auto; }
        h3 { margin-bottom: 25px; }
    </style>
</head>
<body>

<h3 class="text-center text-primary">Beer Information</h3>

<form action="beer" method="post">

    <div class="mb-3">
        <label class="form-label">Beer Name</label>
        <input type="text" name="name" class="form-control" placeholder="Enter beer name" value="${beerDto.name}">
    </div>

    <div class="mb-3">
        <label class="form-label">Brewery</label>
        <input type="text" name="brewery" class="form-control" placeholder="Enter brewery" value="${beerDto.brewery}">
    </div>

    <div class="mb-3">
        <label class="form-label">Type</label>
        <select name="type" class="form-select">
            <option value="">Select Type</option>
            <c:forEach items="${types}" var="type">
                <option value="${type}" <c:if test="${type == beerDto.type}">selected</c:if>>${type}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Color</label>
        <select name="color" class="form-select">
            <option value="">Select Color</option>
            <c:forEach items="${colors}" var="color">
                <option value="${color}" <c:if test="${color == beerDto.color}">selected</c:if>>${color}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Alcohol Percentage</label>
        <input type="number" step="0.1" name="alcoholPercentage" class="form-control" placeholder="Enter alcohol percentage" value="${beerDto.alcoholPercentage}">
    </div>

    <div class="mb-3">
        <label class="form-label">Availability</label>
        <select name="availability" class="form-select">
            <option value="">Select Availability</option>
            <c:forEach items="${availabilities}" var="availability">
                <option value="${availability}" <c:if test="${availability == beerDto.availability}">selected</c:if>>${availability}</option>
            </c:forEach>
        </select>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>

    <div class="text-center mt-4 mb-4">
        <a href="index.jsp" class="btn btn-outline-primary">Home</a>
    </div>

    <h3 class="message">${message}</h3>

</form>

<c:forEach items="${validationErrors}" var="objectError">
    <p>${objectError.defaultMessage}</p>
</c:forEach>

</body>
</html>


