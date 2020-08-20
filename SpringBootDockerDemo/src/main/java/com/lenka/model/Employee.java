package com.lenka.model;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 837591922816783472L;
	private long id;
	private String name;
	private String address;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
