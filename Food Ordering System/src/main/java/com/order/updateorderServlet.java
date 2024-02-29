package com.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import customer.CustomerDbUtil;

/**
 * Servlet implementation class updateorderServlet
 */
@WebServlet("/updateorderServlet")
public class updateorderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession ss = request.getSession();
		Integer uid = (int) ss.getAttribute("uid");
		
		String ordername =request.getParameter("oname");
		String quantity = request.getParameter("qty");
		String phone =request.getParameter("phno");
		String ADD =request.getParameter("DAdd");
		

		
		boolean isTrue;
		
		isTrue = OrderDbUtil.updateOrder(uid, ordername, quantity, phone, ADD);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
