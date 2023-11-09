package com.demo.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
	public static void main(String[] args) 
	{
		try {
			FileReader f= new FileReader("userdata.csv");
		} catch (FileNotFoundException e) {
			System.out.println("userdata.csv File not found");
		}
	}
}
