<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String orderName = request.getParameter("ordername");
	String Id = request.getParameter("id");
	
	%>
	<div class="d-flex">
		<form action="deleteorder" method="post">
			<lebel> <span>Order ID</span> <input type="text" name="oid" value="<%=Id%>" readonly>
			</lebel>
			<label> <span class="fname"> Order Name</span> <input
				type="text" name="oname" value="<%=orderName%>" readonly>
			</label> <label> <span> Quantity </span> <input type="number"
				name="qty">
			</label> <label> <span> Phone Number</span> <input type="tel"
				name="phno" value ="<%%>">
			</label> <label> <span> Delivery Address </span> <input type="text"
				name="DAdd">
			</label>
	</div>
	<button type="submit" value="deleteorder" name="submit">
		Delete now</button>
	</div>
	</form>
	</div>

</body>
</html>