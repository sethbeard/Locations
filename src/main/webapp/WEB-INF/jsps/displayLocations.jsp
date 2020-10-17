<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Locations:</h2>
<table>
<tr>
<th>Id</th>
<th>Code</th>
<th>Name</th>
<th>Type</th>

</tr>

<c:forEach items="${locations}" var="location">
<tr>
<td>${location.id}</td>
<td>${location.code}</td>
<td>${location.name}</td>
<td>${location.type}</td>
<td><a href="deleteLocation?id=${location.id}">delete</a></td>
<td><a href="editLocation?id=${location.id}">edit</a></td>
</br>
</tr>
</table>
</c:forEach>


</br>
${msg}
</br>
<a href="showCreate">Add Record</a>
</body>
</html>