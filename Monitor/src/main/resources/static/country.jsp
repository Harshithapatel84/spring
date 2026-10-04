<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Country Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { padding: 30px; }
        form { width: 500px; margin: auto; }
        h3 { margin-bottom: 25px; }
    </style>
</head>
<body>

<h3 class="text-center text-primary">Country Information</h3>

<form action="country" method="post">

    <div class="mb-3">
        <label class="form-label">Country Code</label>
        <input type="text" name="code" class="form-control" placeholder="Enter country code" value="${countryDto.code}">
    </div>

    <div class="mb-3">
        <label class="form-label">Country Name</label>
        <input type="text" name="name" class="form-control" placeholder="Enter country name" value="${countryDto.name}">
    </div>

    <div class="mb-3">
        <label class="form-label">Language</label>
        <select name="language" class="form-select">
            <c:forEach items="${languages}" var="language">
                <option value="${language}" selected="${language==countryDto.language}">${language}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Number of States</label>
        <select name="noOfState" class="form-select">
            <c:forEach items="${noOfStates}" var="noOfState">
                <option value="${noOfState}" selected="${noOfState==countryDto.noOfState}">${noOfState}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Population</label>
        <input type="number" name="population" class="form-control" placeholder="Enter population" value="${countryDto.population}">
    </div>

    <div class="mb-3">
        <label class="form-label">Capital</label>
        <input type="text" name="capital" class="form-control" placeholder="Enter capital" value="${countryDto.capital}">
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