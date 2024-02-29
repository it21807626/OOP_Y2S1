package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertServlet")
public class insertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String Food_name = request.getParameter("fname");
		String Price = request.getParameter("price");
		String Description = request.getParameter("desc");

		String MID = request.getParameter("mid");
		
		boolean isTrue;
		isTrue = AdminDBUtil.insertmenu(Food_name, Price, Description,MID);
		
		if(isTrue == true) {
			RequestDispatcher dis= request.getRequestDispatcher("Menu.jsp");
			dis.forward(request, response);
			
		} 
		else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);				
		}

		
		
	}

}

