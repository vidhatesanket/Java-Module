package com.demo.test;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

public class EmpMainMethod {
	
	public static void main(String[] args) {
		
		EmpService e=  new EmpServiceImpl();
		
		//Deserialization
		e.readDataFromFile();
		
		List<Employee> elist = e.displayAll();
		System.out.println(elist);
		
		//Serialization
		e.writeToFile();
	}
}
