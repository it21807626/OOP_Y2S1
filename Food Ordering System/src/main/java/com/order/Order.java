package com.order;

public class Order {
	
	private int oid;
	private String ordername;
	private int quantity;
	private String phone ;
	private String daddress;
	private int ccid;
	
	public Order(int oid, String ordername, int quantity, String phone, String daddress,int ccid) {
		super();
		this.oid = oid;
		this.ordername = ordername;
		this.quantity = quantity;
		this.phone = phone;
		this.daddress = daddress;
		this.ccid = ccid;
	}


	public int getOid() {
		return oid;
	}


	public String getOrdername() {
		return ordername;
	}


	public int getQuantity() {
		return quantity;
	}


	public String getPhone() {
		return phone;
	}


	public String getDaddress() {
		return daddress;
	}
	public int getCcid() {
		return ccid;
		
		
	}

	

	
	

}
