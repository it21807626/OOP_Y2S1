<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "css/styles.css">
<link rel = "stylesheet" href = "css/orderStyle.css">
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
      <h2> Admin Login </h2>  
  </div>  
 <div class="d-flex">  
<form action="adminlog" method = "post"> 
        <label>  
            <span> Email Address <span class="required">*</span></span>  
            <input type="email" name="email"required>   
          </label> 
          <label>  
            <span> Password<span class="required">*</span></span>  
            <input type="password" name="pass"required>   
          </label>
         
          <button type="submit" name = "submit" value ="login"> Login </button>  
       
      </form>
 </div>      
 <center><a href ="admininsert.jsp">ADMIN SIGN UP</a></center>
</div>
</body>
</html>



