<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet" href="css/orderStyle.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
		<div class="logo">
			<a href="index.jsp"><img src="images/logo.png"
				style="width: 130px; height: 130px"> </a>
		</div>

		<ul class="menu">
			<a href="index.jsp"><li class="menu1">Home</li> </a>
			<a href="#"><li class="menu1">About us</li> </a>
			<a href="Menu.jsp"><li class="menu1">Menu</li></a>
			<a href="order.jsp"><li class="menu1">Order</li> </a>
			<a href="giveFeedback.jsp"><li class="menu1">Feedback</li></a>
			<a href="#"><img src="images/user.png"
				style="width: 50px; height: 50px; float: right"></a>

		</ul>
		<br>


	</header>

<h1>Menu</h1>
<center><table>
			<th>Menu</th>
			<th>Price</th>
			<th>Description</th>


			<c:forEach var="m" items="${menuDetails}">

				<tr>
					<td>${m.name}</td>
					<td>${m.price}</td>
					<td>${m.description}</td>
				</tr>

			</c:forEach>
		</table></center>
</body>
</html>