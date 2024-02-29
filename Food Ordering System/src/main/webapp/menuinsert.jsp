<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<% 
		
		String id = (String)session.getAttribute("admin");
%>
	

<!DOCTYPE html>

<html>
<link rel = "stylesheet" href = "css/styles.css">  
<link rel = "stylesheet" href = "css/orderStyle.css">
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
      <h2> Add Menu </h2>  
  </div>  
<div class="d-flex">
<form  action="add" method="post">
Food Name <input type="text" name="fname" required><br>
Price <input type="text" name="price" required><br>
Description <input type="text" name="desc" required><br>
<input type="hidden" name="mid" value="<%= id %>">
<input type="submit" name="submit" value="Add">
</form>
 </div>


</body>
</html>