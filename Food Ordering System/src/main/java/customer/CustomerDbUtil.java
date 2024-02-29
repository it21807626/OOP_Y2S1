package customer;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import com.admin.Menu;
import com.order.DBConnect;
import com.order.Order;

import Feedback.feedbackInsert;
import pay.payment.Payment;

public class CustomerDbUtil {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List<Customer> validate(String email, String password){
		
		ArrayList<Customer> cus = new ArrayList<>();

		try {
			boolean isSuccess = false;
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from profile where email ='"+email+"' and password='"+password+"'"; 
			
			ResultSet rs = stmt.executeQuery(sql) ;
			
	
			
			if(rs.next()) {
				
				int Id = rs.getInt(1);
				String name = rs.getString(2);
				String City = rs.getString(3);
				String Address = rs.getString(4);
				String phone = rs.getString(5);
				String Email = rs.getString(6);
				String Password = rs.getString(7);
				
				Customer c = new Customer(Id,name,City,Address,phone,Email,Password);
				
				
				cus.add(c);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		return cus;
		
	}
	
	public static boolean insertCustomer(String fullname, String city, String address, String phone, String email,String password) {
		
		boolean isSuccess = false;
	
		
		try {
					con = DBConnect.getConnection();
					stmt = con.createStatement();
			 
					String sql = "insert into profile values (0,'"+fullname+"','"+city+"','"+address+"','"+phone+"','"+email+"','"+password+"')";
					int rs = stmt.executeUpdate(sql);
					
					if(rs > 0) {
						
						isSuccess = true;
					}else {
						
						isSuccess = false;
					}
					
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return isSuccess;
		
		
		
	}
	
	public static List<Order> getorder(int ID){
		
		ArrayList<Order> ord = new ArrayList<>();
		System.out.println(ID);

		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from orderdb where cid = '"+ID+"'"; 
			ResultSet rs = stmt.executeQuery(sql) ;
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String Oname = rs.getString(2);
				int qty = rs.getInt(3);
				String phone = rs.getString(4);
				String Address = rs.getString(5);
				
			Order obj = new Order(id, Oname, qty, phone, Address,ID);
			ord.add(obj);
				
				
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		return ord;
		
	}
	
	
	public static boolean updateCustomer(Integer id,String fullname, String city, String address, String phone, String email,String password) {
		
		boolean isSuccess = false;
	
		
		try {
					con = DBConnect.getConnection();
					stmt = con.createStatement();
			 
					
					String updateCusQuery = "update profile set firstName='"+fullname+"',City='"+city+"',Address='"+address+"',phoneNo='"+phone+"'"+"where cid='"+id+"'";
					int rs = stmt.executeUpdate(updateCusQuery);
					
					if(rs > 0) {
						
						isSuccess = true;
					}else {
						
						isSuccess = false;
					}
					
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return isSuccess;
		
		
		
	}
public static List<Payment> getpayment(int ID){
		
		ArrayList<Payment> pay = new ArrayList<>();
		System.out.println(ID);

		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from payment where pid = '"+ID+"'"; 
			ResultSet rs = stmt.executeQuery(sql) ;
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String accnum = rs.getString(2);
				String Cname = rs.getString(3);
				String Cnumber = rs.getString(4);
				String exmonth = rs.getString(5);
				String exyear = rs.getString(6);
				String cvc = rs.getString(7);
				String amount = rs.getString(8);
				
			Payment p = new Payment(id, accnum, Cname, Cnumber, exmonth, exyear, cvc, amount,ID);
			pay.add(p);
				
				
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		return pay;
		
 }
public static List<feedbackInsert> getFeedback(int ID){
	
	ArrayList<feedbackInsert> fed = new ArrayList<>();
	System.out.println(ID);

	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from feedback where fid = '"+ID+"'"; 
		ResultSet rs = stmt.executeQuery(sql) ;
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String CusName = rs.getString(2);
			String email = rs.getString(3);
			int Rate = rs.getInt(4);
			String Comment = rs.getString(5);
		
		
		feedbackInsert f = new feedbackInsert(id, CusName, email, Rate, Comment,ID);
		fed.add(f);
			
			
			
			
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	
	
	return fed;
	
}




	
	
}
