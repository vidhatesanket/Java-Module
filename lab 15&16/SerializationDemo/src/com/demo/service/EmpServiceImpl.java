package com.demo.service;

import dao.EmpDaoImpl;

import java.util.List;

import com.demo.beans.Employee;

import dao.EmpDao;

public class EmpServiceImpl implements EmpService {
	
	EmpDao edao=new EmpDaoImpl();
	@Override
	public void readDataFromFile() {
		edao.readFile();
		
	}
	
	
	
	@Override
	public void writeToFile() {
		edao.writeDataIntoFile();
	}



	@Override
	public List<Employee> displayAll() {
		return edao.displayAll();
	}

}
