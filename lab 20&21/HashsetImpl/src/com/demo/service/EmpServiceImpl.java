package com.demo.service;

import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService {
	
	EmpDao edao = new EmpDaoImpl();
	@Override
	public void add() {
		
		edao.addElement();
	}
	@Override
	public void displayAll() {
		edao.getAll();
		
	}
	

	

}
