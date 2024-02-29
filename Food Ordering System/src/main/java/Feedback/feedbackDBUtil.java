package Feedback;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.order.DBConnect;

public class feedbackDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	/*public static boolean validate(String customerName, String Email, int rate, String comments) {
	
	boolean isSuccess = false;
	
	String url = "jdbc:mysql://localhost:3306/feedback";
	String user = "root";
	String pass = "sashini123";
	

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement stmt = con.createStatement();
		String sql = "insert into feedback values ('"+customerName+"','"+Email+"','"+rate+"','"+comments+"')";
		ResultSet rs = stmt.executeQuery(sql);
		
		if (rs.next()) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}*/



	public static boolean insertfeedback(String customerName, String Email, String rate, String comments,int FID) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			
			String sql = "insert into feedback values (0,'"+customerName+"','"+Email+"','"+rate+"','"+comments+"','"+FID+"')";
			int rs = stmt.executeUpdate(sql);
			
			 if (rs > 0) {
					isSuccess = true;
				} else {
					isSuccess = false;
				}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}


public static boolean updateFeedback(Integer id, String name, String Email, String rate, String comments) {
	
	boolean isSuccess = false;
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		String updatefedQuery = "update feedback set customerName='"+name+"', Email='"+Email+"',rate='"+rate+"',comments='"+comments+"'"+"where fid='"+id+"'";
		 int rs = stmt.executeUpdate(updatefedQuery);
		 
		 if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
	}
	 catch (Exception e) {
			e.printStackTrace();
		}
		
	
	return isSuccess;
}

//public static List<feedbackInsert> getFeedbackDetails(String id){
//	
//	
//	
//	ArrayList<feedbackInsert> feed = new ArrayList<>();
//	
//	try {
//		
//		con = DBConnect.getConnection();
//		stmt = con.createStatement();
//		
//		String sql = "select * from feedback where idfeedBack='"+id+"'";
//		rs = stmt.executeQuery(sql);
//		
//		while(rs.next()) {
//		
//		int id1 = rs.getInt(1);
//		String name = rs.getString(2);
//		String Email = rs.getString(3);
//		int rate = rs.getInt(4);
//		String comments = rs.getString(5);
//		
//		feedbackInsert fb = new feedbackInsert (id1,name,Email,rate,comments);
//		feed.add(fb);
//		
//		}
//	}
//	catch(Exception e){
//		e.printStackTrace();
//		
//	}
//	
//	return feed;
//}

public static boolean deleteFeedback(String id)
{
	
	int convId=Integer.parseInt(id);
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "delete from feedback where idfeedback='"+convId+"'";
		int r = stmt.executeUpdate(sql);
		
		if(r>0) {
			
			isSuccess=true;
		}
		else {
			
			isSuccess=false;
		}
	
	}
	catch(Exception e) {
		
		e.printStackTrace();
	}
	


return isSuccess;

}
}





