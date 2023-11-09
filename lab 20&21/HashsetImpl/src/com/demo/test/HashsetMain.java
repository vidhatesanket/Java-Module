package com.demo.test;
import java.util.*;

import com.demo.beans.Emp;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

public class HashsetMain {

	public static void main(String[] args) {
		
		EmpService e=new EmpServiceImpl();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of objects you want to store");
		int size=sc.nextInt();
		
		for(int i=0; i < size; i++) {
			e.add();
		}
		
		e.displayAll();
		
		
	}
}
