package com.demo.Beans;

public class Parent {
	private String name;
	protected String Lastname;
	
//	default constructor
	public Parent() {
		super();
	}
	
//	parameterized constructor
	public Parent(String name, String lastname) {
		super();
		this.name = name;
		Lastname = lastname;
	}
	
//	tostring method
	@Override
	public String toString() {
		return "Parent [name=" + name + ", Lastname=" + Lastname + "]";
	}
	
//	gettres and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	

}
