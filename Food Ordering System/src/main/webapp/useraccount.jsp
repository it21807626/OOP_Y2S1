<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	
</head>
<body>

	<table>
	<c:forEach var="admin" items="${adminDetails}">
	
	<c:set var="id" value="${admin.id}"/>
	<c:set var="name" value="${admin.name}"/>
	<c:set var="email" value="${admin.email}"/>
	<c:set var="phone" value="${admin.phone}"/>
	<c:set var="username" value="${admin.userName}"/>
	<c:set var="password" value="${admin.password}"/>
	
	<tr>
		<td>Admin ID</td>
		<td>${admin.id}</td>
	</tr>
	<tr>
		<td>Admin Name</td>
		<td>${admin.name}</td>
	</tr>
	<tr>
		<td>Admin Email</td>
		<td>${admin.email}</td>
	</tr>
	<tr>
		<td>Admin Phone</td>
		<td>${admin.phone}</td>
	</tr>
	<tr>
		<td>Admin User Name</td>
		<td>${admin.userName}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="updateadmin.jsp" var="adminupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	<a href="${adminupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	
	<br>
	<c:url value="deleteadmin.jsp" var="admindelete">
		<c:param name="id" value="${id}" />
		<c:param name="name" value="${name}" />
		<c:param name="email" value="${email}" />
		<c:param name="uname" value="${username}" />
		<c:param name="pass" value="${password}" />
	</c:url>
	<a href="${admindelete}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>