package com.order;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/orderServlet")
public class orderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String orderName =request.getParameter("oname");
		int Quantity = Integer.parseInt(request.getParameter("qty"));
		String phoneNo =request.getParameter("phno");
		String DeliveryAddress =request.getParameter("DAdd");
		int CID = Integer.parseInt(request.getParameter("cid"));
		
		boolean isTrue;
		
		isTrue = OrderDbUtil.insertOrder(orderName, Quantity, phoneNo, DeliveryAddress,CID);
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("payinsert.jsp");
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
		
		
	}
	
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		System.out.println("ccccccccccccccccccccc");
//        int id = Integer.parseInt(request.getParameter("cid"));
//        System.out.println(id);
//		try {
//			List<Order> orderDetails = OrderDbUtil.getorder(id);
//			request.setAttribute("orderDetails",orderDetails);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		request.getRequestDispatcher("userprofile.jsp").forward(request, response);
//	}

}









