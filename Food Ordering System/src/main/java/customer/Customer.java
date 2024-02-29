package customer;

public class Customer {

	
	
	private int id;
	private String fname;
	private String city;
	private String address;
	private String phoneNo;
	private String email;
	private String password;
	
	

	public Customer(int id, String fname, String city, String address, String phoneNo, String email,
			String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.city = city;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		
		
	}
	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}


	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}
