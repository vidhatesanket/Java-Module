package sportPackage;

import java.time.LocalDate;

public class Vendor extends Employee{
	
	private double no_of_emp;
	private  double amount;
	
	public Vendor() {
		super();
		System.out.println(amount);
		
	}
	
	public Vendor(int id, String name, String mobile, String email,String dept, String desg, LocalDate doj,Double no_of_emp, Double amount) {
		super(id,name, mobile, email,dept,desg,doj);
		this.no_of_emp = no_of_emp;
		this.amount = amount;
	}
	
	public double getNo_of_emp() {
		return no_of_emp;
	}
	
	public void setNo_of_emp(Double no_of_emp) {
		this.no_of_emp = no_of_emp;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+"Vendor [no_of_emp=" + no_of_emp + ", amount=" + amount +"]";
	}
	
	public double calculateSal() {
		return no_of_emp*amount;
	}
	
	
	

}
