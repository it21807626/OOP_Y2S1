package Feedback;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pay.payment.PaymentDBUtil;


@WebServlet("/updateFeedbackServlet")
public class updateFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession ss = request.getSession();
		Integer uid = (int) ss.getAttribute("uid");
	
		String name = request.getParameter("name");
		String Email = request.getParameter("Email");
		String rate = request.getParameter("rate");
		String comments = request.getParameter("comments");
		
		boolean isTrue;
		
		isTrue = feedbackDBUtil.updateFeedback(uid, name, Email, rate, comments);
		if( isTrue == true)
		{
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
