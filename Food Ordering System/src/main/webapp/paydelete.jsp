<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		
		<%
		String idpayment = request.getParameter("idpayment");
		String acNumber = request.getParameter("acNumber");
		String nameOnCard = request.getParameter("nameOnCard");
		String creditCardNumber = request.getParameter("creditCardNumber");
		String cExMonth = request.getParameter("cExMonth");
		String cExYear = request.getParameter("cExYear");
		String cvc = request.getParameter("cvc");
		String amount = request.getParameter("amount");
		%>

	<div class="container">
			  
  			<div class="title">  
      			<h2> Payment Details </h2>  
  			</div>  
			
			<div class="d-flex">  
  				<form action= "delete" method = "post">  
 
				    <label>  
				      <span class="fname"> Bank Account Number <span class="required"> * </span></span>  
				      <input type="text" name="acnumber" placeholder="Enter the Bank account number" required>  
				    </label>
				    <label>  
				      <span class="fname"> Name on Card <span class="required"> * </span></span>  
				      <input type="text" name="name" value="<%=nameOnCard %>" placeholder="Enter your name" required>  
				    </label>  
				    <label>  
				      <span> Credit Card Number <span class="required"> * </span></span>  
				      <input type="text" name="number" value="<%=creditCardNumber %>" placeholder="0000-0000-0000" pattern="[0-9]{12}" required>  
				    </label>  
				    <label>  
				      <span> Card Expiry Month <span class="required">*</span></span>  
				      <input type="text" name="month" value="<%=cExMonth %>" placeholder="MM" required>   
				    </label>  
				    <label>  
				      <span> Card Expiry Year <span class="required">*</span></span>  
				      <input type="text" name="year" value="<%=cExYear %>" placeholder="YYYY" pattern="[0-9]{4}"required>   
				    </label> 
					<label> 
					   <span> Card CVC <span class="required">*</span></span>
					   <input type="text" name="cvc" value="<%=cvc %>" placeholder="CVC" pattern="[0-9]{3}" required>
					</label>
					<label>
					   <span> Amount <span class="required">*</span></span>
					   <input type="text" name="pamount" placeholder="Enter the amount" required>
					</label>
					
					<div>  
				    <button type="submit" value = "pay" name="submit"> Delete now </button>  
				    </div>  
  				</form>
			</div>
		
</body>
</html>