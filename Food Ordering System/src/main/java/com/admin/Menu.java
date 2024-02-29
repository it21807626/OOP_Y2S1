package com.admin;

public class Menu {
    private int id;
    private String name;
    private String price;
    private String description;
    private String mmid;
   
    
    public Menu(int id, String name, String price, String description,String mid) 
    		 {
	this.id = id;
	this.name = name;
	this.price = price;
	this.description = description;
	this.mmid = mid;
	
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    public String getMmid() {
        return mmid;
    }

   
}
