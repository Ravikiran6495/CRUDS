<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<table border="1">

<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<c:forEach var="stud" items="${al}">
<tr>
<td>${stud.firstName}</td>
<td>${stud.lastName}</td>
<td><a href="#">Edit</a></td>
<td><a href="http://localhost:8085/${stud.id}">Delete</a></td>

</tr>
</c:forEach>

</table>

<a href="http://localhost:8085/home"><button>Add Student</button></a>

</body>
</html>