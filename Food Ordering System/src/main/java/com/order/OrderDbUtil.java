package com.order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.order.DBConnect;
import com.order.Order;

public class OrderDbUtil {
	

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

public static boolean insertOrder(String OrderName, int quantity, String phone, String DelAddress,int cid) {
		
		boolean isSuccess = false;
		
		
		try {
			 
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					String sql = "insert into orderdb values (0,'"+OrderName+"','"+quantity+"','"+phone+"','"+DelAddress+"','"+cid+"')";
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
public static boolean deleteOrder(int ID) {
	
	boolean isSuccess = false;
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "delete * from orderdb where orderId ='"+ID+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			
			isSuccess = true;
		}else {
			
			isSuccess = false;
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	
	
	return isSuccess;
}
public static boolean updateOrder(Integer id,String ordername, String quantity, String phone, String ADD ) {
	
	boolean isSuccess = false;

	
	try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
		 
				
				String updateorderQuery = "update orderdb set orderName='"+ordername+"',quantity='"+quantity+"',phone='"+phone+"',deliveryAdd='"+ADD+"'"+"where cid='"+id+"'";
				int rs = stmt.executeUpdate(updateorderQuery);
				
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








	
}
