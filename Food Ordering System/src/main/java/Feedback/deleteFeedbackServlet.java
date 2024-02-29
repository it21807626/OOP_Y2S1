package com.feedback;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteFeedbackServlet
 */
@WebServlet("/deleteFeedbackServlet")
public class deleteFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue=feedbackDBUtil.deleteFeedback(id);
		if(isTrue==true) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("giveFeedback.jsp");
			dispatcher.forward(request, response);
			
		}
		
		else {
			List<feedbackInsert>feedbackDetails=feedbackDBUtil.getFeedbackDetails(id);
			request.setAttribute("feedbackDetails", feedbackDetails);
			
					RequestDispatcher dispatcher=request.getRequestDispatcher("showFeedback.jsp");
					dispatcher.forward(request, response);		
					
		}
		
		
	}

}
