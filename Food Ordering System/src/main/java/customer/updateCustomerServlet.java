package customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class updateCustomerServlet
 */
@WebServlet("/updateCustomerServlet")
public class updateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ss = request.getSession();
		Integer uid = (int) ss.getAttribute("uid");
		String fullname =request.getParameter("fname");
		String City = request.getParameter("city");
		String Address =request.getParameter("houseadd");
		String phoneNo =request.getParameter("pno");
		String Email =request.getParameter("eemail");
		String password =request.getParameter("pass2");
		

		
		boolean isTrue;
		
		isTrue = CustomerDbUtil.updateCustomer(uid,fullname, City, Address, phoneNo, Email, password);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("userprofile.jsp");
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
