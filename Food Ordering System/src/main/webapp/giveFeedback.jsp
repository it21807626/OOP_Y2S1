<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%

			HttpSession ss = request.getSession();
			int uid = (int) ss.getAttribute("uid");
		%>
    
    
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" href = "css/orderStyle.css">  
<link rel = "stylesheet" href = "css/styles.css">  
<meta charset="ISO-8859-1">
<title>Feedback</title>
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
      <h2> Add Feedback </h2>  
  </div>  

<div class="d-flex">
<form action="insertfed" method="post">
		Name: <input type="text" name="custName" required><br><br>
		E-mail: <input type="text" name="Email" required pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}" title="Please enter a valid email address" /><br><br><br><br>
	    Rate us: <input type="text" name="rate"required><br><br>
		Comments<textarea name="comments"required></textarea><br><br>
		<input type="hidden" name="fid" value=${uid}>
		
		
		<button type="submit" value = "fed" name="submit"> submit feedback</button>
		
		
</form>
</div>
</body>
</html>