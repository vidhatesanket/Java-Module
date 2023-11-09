package com.demo.service;
import java.util.List;

import com.demo.beans.Employee;


public interface EmployeeService {

	void addNewEmp(int ch);
	boolean deleteById(int did);
	boolean modifyBySal(int id,double sal);
	List<Employee> displayAll();
	Employee displayById(int id);
}
