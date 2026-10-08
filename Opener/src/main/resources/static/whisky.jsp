
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Whisky Information</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body { padding: 30px; }
        form { width: 500px; margin: auto; }
        h2 { margin-bottom: 25px; }
    </style>
</head>

<body>

<h2 class="text-center text-primary">Whisky Information</h2>

<form action="whisky" method="post">

    <div class="mb-3">
        <label class="form-label">Whisky Name</label>
        <input type="text" name="name" class="form-control" placeholder="Enter whisky name"
               value="${whiskyDto.name}">
    </div>

    <div class="mb-3">
        <label class="form-label">Brand</label>
        <input type="text" name="brand" class="form-control" placeholder="Enter brand"
               value="${whiskyDto.brand}">
    </div>

    <div class="mb-3">
        <label class="form-label">Manufacturing Company</label>
        <input type="text" name="mfgCompany" class="form-control"
         placeholder="Enter manufacturing company" value="${whiskyDto.mfgCompany}">
    </div>

    <div class="mb-3">
        <label class="form-label">Manufacturing Date</label>
        <input type="date" name="mfgDate" class="form-control" value="${whiskyDto.mfgDate}">
    </div>

    <div class="mb-3">
        <label class="form-label">Price</label>
        <input type="number" step="0.01" name="price"
               class="form-control"
               placeholder="Enter price"
               value="${whiskyDto.price}">
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
