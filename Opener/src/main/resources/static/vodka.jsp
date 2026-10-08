
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Vodka Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { padding: 30px; }
        form { width: 500px; margin: auto; }
        h3 { margin-bottom: 25px; }
    </style>
</head>
<body>

<h3 class="text-center text-primary">Vodka Information</h3>

<form action="vodka" method="post">

    <div class="mb-3">
        <label class="form-label">Vodka Name</label>
        <input type="text" name="name" class="form-control" placeholder="Enter vodka name" value="${vodkaDto.name}">
    </div>

    <div class="mb-3">
        <label class="form-label">Manufacturing Address</label>
        <input type="text" name="mfgAddress" class="form-control" placeholder="Enter manufacturing address" value="${vodkaDto.mfgAddress}">
    </div>

    <div class="mb-3">
        <label class="form-label">Price</label>
        <input type="number" step="0.01" name="price" class="form-control" placeholder="Enter price" value="${vodkaDto.price}">
    </div>

   <div class="mb-3">
       <label class="form-label">Brand</label>
       <select name="brand" class="form-select">
           <option value="">Select Brand</option>
           <c:forEach items="${brands}" var="brand">
               <option value="${brand}" <c:if test="${brand == vodkaDto.brand}">selected</c:if>>${brand}</option>
           </c:forEach>
       </select>
   </div>

    <div class="mb-3">
        <label class="form-label">Flavour</label>
        <select name="flavour" class="form-select">
            <option value="">Select Flavour</option>
            <c:forEach items="${flavours}" var="flavour">
                <option value="${flavour}" <c:if test="${flavour == vodkaDto.flavour}">selected</c:if>>${flavour}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mb-3">
        <label class="form-label">Alcohol Percentage</label>
        <select name="alcoholPercentage" class="form-select">
            <option value="">Select Alcohol Percentage</option>
            <c:forEach items="${alcoholPercentages}" var="percentage">
                <option value="${percentage}" <c:if test="${percentage == vodkaDto.alcoholPercentage}">selected</c:if>>${percentage}</option>
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
