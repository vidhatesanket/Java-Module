package sportPackage;

import java.time.LocalDate;

public class ContractEmployee extends Employee{
	private double hrs,charges;

	public ContractEmployee() {
		super();
		
	}

	public ContractEmployee(int id, String name, String mobile, String email,String dept, String desg, LocalDate doj,double hrs, double charges) {
		super(id,name,mobile,email,dept,desg,doj);
		this.hrs = hrs;
		this.charges = charges;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"ContractEmployee [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
	public double calculateSal() {
		return hrs*charges;
	}
	

}
