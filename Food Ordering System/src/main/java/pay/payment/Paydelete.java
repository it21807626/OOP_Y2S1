package pay.payment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Paydelete
 */
@WebServlet("/Paydelete")
public class Paydelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//		String idpayment = request.getParameter(idpayment);
//		
//		boolean isTrue;
//		
//		isTrue = PaymentDBUtil.deletepayment(idpayment);
//		
//		if(isTrue == true) {
//			request.getRequestDispatcher("payinsert.jsp").forward(request, response);
//		}
//		else
//			request.getRequestDispatcher("unsuccess.jsp").forward(request, response);
//			
//	}

}
