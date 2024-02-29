<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet" href="css/orderStyle.css">
</head>
<body>



	<div class="container">

		<div class="title">
			<h2>Feedback Details</h2>
		</div>

		<div class="d-flex">
			<form action="updatefed" method="post">
				Name: <input type="text" name="custName"><br>
				<br> E-mail: <input type="text" name="Email"><br>
				<br> Rate us: <input type="text" name="rate"><br>
				<br> Comments
				<textarea name="comments"></textarea>
				<br>
				<br> <input type="hidden" name="fid" value=${uid}>


				<button type="submit" value="fed" name="submit">Update
					feedback</button>


			</form>
		</div>
</body>
</html>