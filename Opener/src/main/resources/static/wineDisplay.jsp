

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
        <title>Wine Details</title>
</head>
<body>
  <h2>Wine Details</h2>
<table border="1">
        <tr>
            <th>ID</th>
            <th>Company Name</th>
            <th>Manufacturing Date</th>
            <th>Manufacturing Name</th>
            <th>Age</th>
        </tr>

         <c:forEach items="${wineList}" var="wine">
            <tr>
                <td>${wine.id}</td>
                <td>${wine.companyName}</td>
                <td>${wine.mfgDate}</td>
                <td>${wine.mfgName}</td>
                <td>${wine.age}</td>
            </tr>
        </c:forEach>
    </table>




</body>
</html>
