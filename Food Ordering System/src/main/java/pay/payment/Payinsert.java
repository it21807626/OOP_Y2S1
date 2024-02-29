package pay.payment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pay.payment.PaymentDBUtil;

/**
 * Servlet implementation class Payinsert
 */
@WebServlet("/Payinsert")
public class Payinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String acNumber = request.getParameter("acnumber");
		String nameOnCard = request.getParameter("name");
		String creditCardNumber = request.getParameter("number");
		String cExMonth = request.getParameter("month");
		String cExYear = request.getParameter("year");
		String cvc = request.getParameter("cvc");
		String amount = request.getParameter("pamount");
		int PID = Integer.parseInt(request.getParameter("pid"));
		
		
		boolean isTrue;
		
		isTrue = PaymentDBUtil.insertpayment(acNumber,nameOnCard, creditCardNumber, cExMonth, cExYear, cvc, amount,PID);
		
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
