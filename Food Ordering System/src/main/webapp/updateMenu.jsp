<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
</head>
<body>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String description = request.getParameter("descrption");
		
	%>
	
	
	<form action="update" method="post">
	<table>
		<tr>
			<td>Menu ID</td>
			<td><input type="text" name="adminid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= name %>"></td>
		</tr>
		<tr>
		<td>Price</td>
		<td><input type="text" name="price" value="<%= price %>"></td>
	</tr>
	<tr>
		<td>Description</td>
		<td><input type="text" name="description" value="<%= description %>"></td>
	</tr>
		
	</table>
	<br>
	<input type="submit" name="submit" value="Update menu">
	</form>

</body>
</html>