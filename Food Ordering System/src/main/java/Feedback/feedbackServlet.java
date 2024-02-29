package Feedback;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/feedbackServlet")
public class feedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String customerName = request.getParameter("custName");
		String Email = request.getParameter("Email");
		String rate = request.getParameter("rate");
		String comments = request.getParameter("comments");

		int FID = Integer.parseInt(request.getParameter("fid"));
		
         boolean isTrue;
		
		isTrue = feedbackDBUtil.insertfeedback(customerName, Email, rate, comments,FID);
		
		if(isTrue == true) {
		
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		} else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}
}


