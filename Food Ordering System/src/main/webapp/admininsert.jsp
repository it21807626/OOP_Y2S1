<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel = "stylesheet" href = "css/styles.css">  
<link rel = "stylesheet" href = "css/orderStyle.css">

<body>
 <header>
        <div class = "logo">
        <a href = "index.jsp"><img src = "images/logo.png" style = "width : 130px ; height : 130px"> </a>
        </div>
        
        <ul class = "menu">
         <a href="index.jsp" ><li class = "menu1">  Home </li> </a>
         <a href="#"><li class = "menu1">  About us </li> </a>
         <a href="Menu.jsp"><li class = "menu1"> Menu </li></a>
         <a href="order.jsp"><li class = "menu1"> Order </li> </a>
         <a href="giveFeedback.jsp"><li class = "menu1">Feedback</li></a>
         <a href="login.jsp"><img src = "images/user.png" style = "width : 50px ; height : 50px ; float : right"></a>
         
         </ul>
         <br>
        
         
        </header>
        
  
<div class="container">  
    <div class="title">  
        <h2> admin signup </h2>                
	</div>
	<div class="d-flex">  
	<form action="admininsert" method="post">
		Name <input type="text" name="name"required><br>
		Email <input type="text" name="email"required><br>
		Phone Number <input type="text" name="phone" pattern = "[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]" required><br>
		User Name <input type="text" name="uid"required><br>
		Password <input type="password" name="psw"required><br>
		
		<input type="submit" name="submit" value="SignUp">
	</form>
	</div>
</div>

</body>
</html>