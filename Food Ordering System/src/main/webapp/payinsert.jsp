<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%

			HttpSession ss = request.getSession();
			int uid = (int) ss.getAttribute("uid");

%>
<!DOCTYPE html>
<html>
<head>

<link rel = "stylesheet" href = "css/styles.css">
<link rel = "stylesheet" href = "css/orderStyle.css">
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
      			<h2> Payment Details </h2>  
  			</div>  
			
			 <div class="d-flex">   
  				<form action= "insert" method = "post">  
 
				    <label>  
				      <span class="fname"> Bank Account Number <span class="required"> * </span></span>  
				      <input type="text" name="acnumber" placeholder="Enter the Bank account number" required>  
				    </label>
				    <label>  
				      <span class="fname"> Name on Card <span class="required"> * </span></span>  
				      <input type="text" name="name" placeholder="Enter your name" required>  
				    </label>  
				    <label>  
				      <span> Credit Card Number <span class="required"> * </span></span>  
				      <input type="text" name="number" placeholder="0000-0000-0000" pattern="[0-9]{12}" required>  
				    </label>  
				    <label>  
				      <span> Card Expiry Month <span class="required">*</span></span>  
				      <input type="text" name="month" placeholder="MM" required>   
				    </label>  
				    <label>  
				      <span> Card Expiry Year <span class="required">*</span></span>  
				      <input type="text" name="year" placeholder="YYYY" pattern="[0-9]{4}"required>   
				    </label> 
					<label> 
					   <span> Card CVC <span class="required">*</span></span>
					   <input type="text" name="cvc" placeholder="CVC" pattern="[0-9]{3}" required>
					</label>
					<label>
					   <span> Amount <span class="required">*</span></span>
					   <input type="text" name="pamount" placeholder="Enter the amount" required>
					</label>
					<input type="hidden" name="pid" value=${uid}>
					
					<div>  
				    <button type="submit" value = "pay" name="submit"> Pay now </button>  
				    </div>  
  				</form>
			</div>
</div>
</body>
</html>