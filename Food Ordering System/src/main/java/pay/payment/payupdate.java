package pay.payment;

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
 * Servlet implementation class payupdate
 */
@WebServlet("/payupdate")
public class payupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession ss = request.getSession();
		Integer uid = (int) ss.getAttribute("uid");
		
		String acNumber = request.getParameter("acnumber");
		String nameOnCard = request.getParameter("name");
		String creditCardNumber = request.getParameter("number");
		String cExMonth = request.getParameter("month");
		String cExYear = request.getParameter("year");
		String cvc = request.getParameter("cvc");
		String amount = request.getParameter("pamount");
		
		
		boolean isTrue;
		
		isTrue = PaymentDBUtil.updatepayment(uid,acNumber,nameOnCard,creditCardNumber,cExMonth,cExYear,cvc,amount);
		
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
