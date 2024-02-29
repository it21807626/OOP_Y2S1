<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My account</title>

<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet" href="css/orderStyle.css">


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

	<center>
		<table>
			<h1>My profile</h1>
			<c:forEach var="cus" items="${cusDetails}">
				<tr>
					<td>Customer ID</td>
					<td>${cus.id}</td>
				</tr>
				<tr>
					<td>Customer Name</td>
					<td>${cus.fname}</td>
				</tr>
				<tr>
					<td>City</td>
					<td>${cus.city}</td>
				</tr>
				<tr>
					<td>Address</td>
					<td>${cus.address}</td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td>${cus.phoneNo}</td>
				</tr>
				<tr>
					<td>Email</td>
					<td>${cus.email}</td>
				</tr>

			</c:forEach>

		</table>
	</center>
	<center>
		
		<form action="UpdateCustomer.jsp" method="POST">
			<input type="submit" name=submit value="upadte my account">
		</form>
	</center>
	<br>

	<h1>Order History</h1>
	<center>
		<table>
			<th>Order ID</th>
			<th>Order Name</th>
			<th>Quantity</th>
			<th>Phone number</th>
			<th>Delivery address</th>


			<c:forEach var="ord" items="${orderDetails}">

				<tr>
					<td>${ord.oid}</td>
					<td>${ord.ordername}</td>
					<td>${ord.quantity}</td>
					<td>${ord.phone}</td>
					<td>${ord.daddress}</td>

		
				</tr>

			</c:forEach>
		</table>
					

				<form action="UpdateOrder.jsp" method="POST">
					<input type="submit" name=submit value="upadte my order">
				</form>
			
	</center>
	<br>

	<h1>Payment History</h1>
	<center>
		<table>
			<th>Payment ID</th>
			<th>Account No</th>
			<th>Name on card</th>
			<th>card number</th>
			<th>Amount</th>

			<c:forEach var="pay" items="${payDetails}">

				<tr>
					<td>${pay.idpaymnet}</td>
					<td>${pay.acNumber}</td>
					<td>${pay.nameOnCard}</td>
					<td>${pay.creditCardNumber}</td>
					<td>${pay.amount}</td>
			</c:forEach>
			</table>
			<form action="payupdate.jsp" method="POST">
					<input type="submit" name=submit value="upadte payment">
				</form>
			<br>
	<h1>Feedback History</h1>
	<center>
		<table>
			<th>Feedback ID</th>
			<th>NAME </th>
			<th>Email</th>
			<th>Rate </th>
			<th>comment</th>

			<c:forEach var="fed" items="${fedDetails}">

				<tr>
					<td>${fed.id}</td>
					<td>${fed.name}</td>
					<td>${fed.EEmail}</td>
					<td>${fed.rate}</td>
					<td>${fed.comments}</td>
			</c:forEach>
			</table>
			<form action="updateFeedback.jsp" method="POST">
					<input type="submit" name=submit value="upadte feedback">
				</form>

</body>

</html>