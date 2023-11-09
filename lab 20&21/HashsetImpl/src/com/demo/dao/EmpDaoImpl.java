package com.demo.dao;

import java.util.HashSet;
import java.util.Scanner;

import com.demo.beans.Emp;

public class EmpDaoImpl implements EmpDao{
	
	HashSet<Emp> hs= new HashSet<>();
	@Override
	public void addElement() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the salary");
		Double sal=sc.nextDouble();
		Emp em=null;
		 em= new Emp(id,name,sal);
		
		
		hs.add(em);
	}
	@Override
	public void getAll() {
		System.out.println(hs);
		
	}
	
	

}
