package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.order.Order;

import Feedback.feedbackInsert;
import customer.Customer;
import pay.payment.Payment;

public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		try {
			
			List<Menu> menuDetails = AdminDBUtil.getmenuDetails();
			
			request.setAttribute("menuDetails", menuDetails);
			
			for(Menu cus : menuDetails) {
				String id = cus.getName();
				System.out.println(id);
			}
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("Menu.jsp");
		dis.forward(request, response);
		
	}

}
