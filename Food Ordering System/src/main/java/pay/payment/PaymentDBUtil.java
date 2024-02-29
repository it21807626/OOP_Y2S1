package pay.payment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.order.*;



public class PaymentDBUtil {

	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
//	public static List<Payment> getpayment(String acNumber){
//		
//		ArrayList<Payment> pay = new ArrayList<>();
//		
//		try {
//			
//			con = DBConnect.getConnection();
//			stmt = con.createStatement();
//			String sql = "select * from payment where acNumber='"+acNumber+"'";
//			
//			 rs = stmt.executeUpdate(sql);
//			
//			while(rs.next()) {
//				int idpayment = rs.getInt(1);
//				String acNumber2 = rs.getString(2); 
//				String nameOnCard = rs.getString(3);
//				String creditCardNumber= rs.getString(4);
//				String cExMonth = rs.getString(5);
//				String cExYear = rs.getString(6);
//				String cvc = rs.getString(7);
//				String amount = rs.getString(8);
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return pay;
//	}
	
	public static boolean insertpayment(String acNumber, String nameOnCard, String creditCardNumber, String cExMonth, String cExYear, String cvc, String amount,int PID)
	{
		boolean isSuccess = false;
		
			try 
			{
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "insert into payment values(0, '"+acNumber+"', '"+nameOnCard+"', '"+creditCardNumber+"', '"+cExMonth+"', '"+cExYear+"', '"+cvc+"', '"+amount+"','"+PID+"' )";
				int rs = stmt.executeUpdate(sql);
				
				if( rs>0)
				{
					isSuccess = true;
				}
				else
				{
					isSuccess = false;
				}
				
			}
			catch(Exception e)	 
			{
				e.printStackTrace();
			}
		
		return isSuccess;
	}
	
	public static boolean updatepayment(Integer id,String acNumber, String nameOnCard, String creditCardNumber, String cExMonth, String cExYear, String cvc, String amount)
	{
		boolean isSuccess = false;
		
			try 
			{
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				
				String updatepayQuery = "update payment set acNumber='"+acNumber+"',nameOnCard='"+nameOnCard+"', creditCardNumber='"+creditCardNumber+"', cExMonth='"+cExMonth+"', cExYear='"+cExYear+"', cvc='"+cvc+"', amount='"+amount+"'"+"where pid='"+id+"'";
				int rs = stmt.executeUpdate(updatepayQuery);
				
				
				if( rs>0)
				{
					isSuccess = true;
				}
				else
				{
					isSuccess = false;
				}
				
				
			}
			catch(Exception e)	 
			{
				System.out.println("Update not successfull");
				e.printStackTrace();
			}
		
		return isSuccess;
	}
	
	public static boolean deletepayment(String idpayment) {
		boolean isSuccess = false;
		int conId = Integer.parseInt(idpayment);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String deleteDocQuery = "delete from payment where idpayment = '"+conId+"'";
			int r = stmt.executeUpdate(deleteDocQuery);
			
			if(r > 0)
				isSuccess = true;
			
			else
				isSuccess = false;
			
		}catch(Exception e) {
			System.out.println("deletion not successfull");
			e.printStackTrace();
		}
		return isSuccess;
	}
}
