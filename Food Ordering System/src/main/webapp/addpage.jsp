<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>  
<html>  
 <head>
<meta name="viewport" content="width=device-width, initial-scale=1">    
<meta charset="UTF-8">    
<title> Sign Up </title> 
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
         <a href="order.jsp"><li class = "menu1"> Order </li> </a>
         <a href="giveFeedback.jsp"><li class = "menu1">Feedback</li></a>
         <a href="login.jsp"><img src = "images/user.png" style = "width : 50px ; height : 50px ; float : right"></a>
         
         </ul>
         <br>
        
         
        </header>

<div class="container">  
  <div class="title">  
      <h2> Sign Up </h2>  
  </div>  
<div class="d-flex">  
  <form action= "sign" method = "post">  
    <label>  
      <span class="fname"> Full Name <span class="required"> * </span></span>  
      <input type="text" name="fname" required>  
  
      <span>City <span class="required">*</span></span>  
      <input type = "text" name="city">  
         
        
      
    </label>  
    <label>  
      <span> Address <span class="required"> * </span></span>  
      <input type="text" name="houseadd" placeholder="House number and street name" required>  
    </label>  
    <label>  
      <span> Phone Number <span class="required">*</span></span>  
      <input type="tel" name="pno">   
    </label>  
    <label>  
      <span> Email Address <span class="required">*</span></span>  
      <input type="email" name="eemail">   
    </label> 
    <label>  
        <span> Password<span class="required">*</span></span>  
        <input type="password" name="pass" required>   
      </label>  
      <label>  
        <span> Confirm Password <span class="required">*</span></span>  
        <input type="password" name="pass2" onchange = "" required>   
      </label>   

    </div>  
    <button type="submit" value = "createcustomer" name="submit"> Sign Up </button>  
    </div>  
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
    
</footer>

</html>  