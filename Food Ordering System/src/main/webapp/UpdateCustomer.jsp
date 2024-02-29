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
<a href = "#"><img src = "images/logo.png" style = "width : 130px ; height : 130px"> </a>
</div>

<ul class = "menu">
 <a href="#" ><li class = "menu1">  Home </li> </a>
 <a href="#"><li class = "menu1">  About us </li> </a>
 <a href="#"><li class = "menu1"> Menu </li></a>
 <a href="order.jsp"><li class = "menu1"> Order </li> </a>
 <a href="#"><li class = "menu1"> Contact us </li></a>
 <a href="#"><img src = "images/user.png" style = "width : 50px ; height : 50px ; float : right"></a>
 
 </ul>
 <br>

 
</header>
		
<h1>Update Account</h1>
<center><div class="d-flex">  
  <form action= "updateCustomer" method = "post">  
 
 <label>  
      <span class="fname"> Full Name <span class="required"> * </span></span>  
      <input type="text" name="fname">  
  
      <span>City <span class="required">*</span></span>  
      <input type = "text" name="city">  
         
    </label>  
    <label>  
      <span> Address <span class="required"> * </span></span>  
      <input type="text" name="houseadd" * required>  
    </label>  
    <label>  
      <span> Phone Number <span class="required">*</span></span>  
      <input type="tel" name="pno">   
    </label>  
    <label>  
      <span> Email Address <span class="required">*</span></span>  
      <input type="email" name="eemail">   
    </label> 
   

    </div>  
    <button type="submit" value = "Updatemydata" name="submit"> Update </button>  
    </div>  
  </form>
  </div></center>
</body>
</html>