<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		
	<header>
	<h1>Log to Payment profile</h1>
	</header>
	<h2>Enter Bank accountnumber to login to the profile</h2><br/>
	<div class="frm">
	<form action="<%=request.getContextPath()%>/DoctorValidateServlet" method="post">
	
		 <input type="text" name="password" placeholder="Enter doctor's password"><br/>
		
		<input type="submit" name="submit" value="Enter">
	
	</form>
	&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
	<a href="insertDoctor.jsp">click here to create new profile </a>
	</div>
</body>
</html>