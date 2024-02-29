package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.order.Order;

import Feedback.feedbackInsert;
import customer.Customer;
import customer.CustomerDbUtil;
import pay.payment.Payment;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Email = request.getParameter("email");
		String password = request.getParameter("pass");
		
		try {
			
			boolean isTrue;
			
			isTrue = AdminDBUtil.validate(Email,password);
			
			if(isTrue == true) {
				
				System.out.println(isTrue + Email);
				
				HttpSession session = request.getSession();
			    session.setAttribute("admin", Email);
			
				
//				RequestDispatcher dis = request.getRequestDispatcher("menuinsert.jsp");
//				dis.forward(request, response);
				
			}else {
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("menuinsert.jsp");
		dis.forward(request, response);
		
	}
}
