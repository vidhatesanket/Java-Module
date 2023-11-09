package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmpService {

	void readDataFromFile();

	List<Employee> displayAll();
	
	void writeToFile();
	 
	
}
