package customer;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.admin.Menu;
import com.order.Order;

import Feedback.feedbackInsert;
import pay.payment.Payment;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Email = request.getParameter("eemail");
		String password = request.getParameter("pass");
		
		try {
			
			List<Customer> cusDetails = CustomerDbUtil.validate(Email, password);
			
			
			HttpSession session = request.getSession();
			if(session != null) {
			for(Customer cus : cusDetails) {
				int id = cus.getId();
				session.setAttribute("uid", id);
			}}
			List<Order> orderDetails = CustomerDbUtil.getorder((int) session.getAttribute("uid"));
			
			request.setAttribute("orderDetails", orderDetails);
			for(Order cus : orderDetails) {
				int id = cus.getOid();
				
			}
            List<Payment> payDetails = CustomerDbUtil.getpayment((int) session.getAttribute("uid"));
			
			request.setAttribute("payDetails", payDetails);
			for(Payment cus : payDetails) {
				int id = cus.getIdpaymnet();
				
			}
			   List<feedbackInsert> fedDetails = CustomerDbUtil.getFeedback((int) session.getAttribute("uid"));
				
				request.setAttribute("fedDetails", fedDetails);
				for(feedbackInsert cus : fedDetails) {
					int id = cus.getId();
					
				}
			
				
			
			request.setAttribute("cusDetails", cusDetails);
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("userprofile.jsp");
		dis.forward(request, response);
		
	}

}
