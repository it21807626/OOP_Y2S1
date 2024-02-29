<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%

			HttpSession ss = request.getSession();
			int uid = (int) ss.getAttribute("uid");

%>
    
<!DOCTYPE html>  
<html>  
 <head>
<meta name="viewport" content="width=device-width, initial-scale=1">    
<meta charset="UTF-8">    
<title> Order Details </title> 
<link rel = "stylesheet" href = "css/orderStyle.css">  
<link rel = "stylesheet" href = "css/styles.css">  
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
         <a href="#"><li class = "menu1"> Order </li> </a>
         <a href="giveFeedback.jsp"><li class = "menu1"> Feedback</li></a>
         <a href="#"><img src = "images/user.png" style = "width : 50px ; height : 50px ; float : right"></a>
         
         </ul>
         <br>
        
         
        </header>

<div class="container">  
  <div class="title">  
      <h2> Order Details </h2>  
  </div>  
<div class="d-flex">  
  <form action= "makeorder" method = "post">  
 
    <label>  
      <span class="fname"> Order Name <span class="required"> * </span></span>  
      <input type="text" name="oname" required>  
    </label>  
    <label>  
      <span> Quantity <span class="required"> * </span></span>  
      <input type="number" name="qty" required>  
    </label>  
    <label>  
      <span> Phone Number <span class="required">*</span></span>  
      <input type="tel" name="phno"required>   
    </label>  
    <label>  
      <span> Delivery Address <span class="required">*</span></span>  
      <input type="text" name="DAdd" required>   
    </label> 
     <input type="hidden" name="cid" value=${uid}>   
 

   <button type="submit" value = "ord" name="submit"> Order</button>
  </form>
  </div>
  <br><br><br>

</body>  
<footer>
    Open : 9am - 9pm |Email : <a href = "#" padding = "10px" >kascknaks</a> | Address : maksndknaskd  | Phone : 071-16565666  <br><br>
    Find us on : <br><br>
    <a href = "#"><img class = "footerImg" src = "images/fb.png"></a>
    <a href = "#"><img class = "footerImg" src = "images/twitter.png"></a>
    <a href = "#"><img class = "footerImg" src = "images/ig.png"></a> 
    <a href = "#"><img class = "footerImg" src = "images/googp.png"></a><br><br>
    <a href = "#"> Privacy Policy </a>
     |
    <a href = "employee_log.html">Employee Log in</a>
</footer>

</html>  