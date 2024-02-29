<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "css/orderStyle.css">  
<link rel = "stylesheet" href = "css/styles.css">  
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
         <a href="#"><li class = "menu1"> Order </li> </a>
         <a href="#"><li class = "menu1">Feedback</li></a>
         <a href="#"><img src = "images/user.png" style = "width : 50px ; height : 50px ; float : right"></a>
         
         </ul>
         <br>
        
         
        </header>
<div class="container">  
  <div class="title">  
      <h2> Update my order </h2>  
  </div>  
<div class="d-flex">  
  <form action= "updateorder" method = "post">  
 
    <label>  
      <span class="fname"> Order Name <span class="required"> * </span></span>  
      <input type="text" name="oname">  
    </label>  
    <label>  
      <span> Quantity <span class="required"> * </span></span>  
      <input type="number" name="qty" required>  
    </label>  
    <label>  
      <span> Phone Number <span class="required">*</span></span>  
      <input type="tel" name="phno">   
    </label>  
    <label>  
      <span> Delivery Address <span class="required">*</span></span>  
      <input type="text" name="DAdd">   
    </label> 
     <input type="hidden" name="cid" value=${uid}>   
 

    </div>  
    <button type="submit" value = "updateorder" name="submit"> Update now </button>  
    </div>
     
  </form>
  </div>




</body>
</html>