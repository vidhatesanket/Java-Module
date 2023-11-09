package com.demo.Beans;

public class child extends Parent{
	private String cname;

	public child(String cname,String name, String lastname) {
		super(name,lastname);
		this.cname = cname;
	}

	public child() {
		super();
	}

	@Override
	public String toString() {
		return "child [childname=" + cname + "]"+super.toString();
	}

	public String getName() {
		return cname;
	}

	public void setName(String name) {
		this.cname = name;
	}
	
	

}
