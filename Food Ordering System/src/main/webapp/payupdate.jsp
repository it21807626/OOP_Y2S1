<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href = "css/styles.css">
<link rel = "stylesheet" href = "css/orderStyle.css">
</head>
<body>



	<div class="container">
			  
  			<div class="title">  
      			<h2> Payment Details </h2>  
  			</div>  
			
			<div class="d-flex">  
  				<form action= "update" method = "post">  
 
				    <label>  
				      <span class="fname"> Bank Account Number <span class="required"> * </span></span>  
				      <input type="text" name="acnumber" placeholder="Enter the Bank account number" required>  
				    </label>
				    <label>  
				      <span class="fname"> Name on Card <span class="required"> * </span></span>  
				      <input type="text" name="name"  placeholder="Enter your name" required>  
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
				      <input type="text" name="year"placeholder="YYYY" pattern="[0-9]{4}"required>   
				    </label> 
					<label> 
					   <span> Card CVC <span class="required">*</span></span>
					   <input type="text" name="cvc"placeholder="CVC" pattern="[0-9]{3}" required>
					</label>
					<label>
					   <span> Amount <span class="required">*</span></span>
					   <input type="text" name="pamount" placeholder="Enter the amount" required>
					</label>
					 <input type="hidden" name="pid" value=${uid}> 
					<div>  
				    <button type="submit" value = "pay" name="submit"> Update now </button>  
				    </div>  
  				</form>
			</div>

</body>
</html>