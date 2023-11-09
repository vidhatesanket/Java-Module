package sportPackage;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
	 private double basicsal,bonus;

	 
	 
	public SalariedEmployee() {
		super();
		System.out.println("Inside SE DC");
		
	}

	public SalariedEmployee(int id, String name, String mobile, String email,String dept, String desg, LocalDate doj,double basicsal, double bonus) {
		super(id,name,mobile,email,dept,desg,doj);
		this.basicsal = basicsal;
		this.bonus = bonus;
	}

	public double getBasicsal() {
		return basicsal;
	}

	public void setBasicsal(double basicsal) {
		this.basicsal = basicsal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calculateSal() {
		return basicsal+0.10*basicsal+0.15*basicsal-0.08*basicsal+bonus;
	}

	
	 
	@Override
	public String toString() {
		return super.toString()+"\n"+"SalariedEmployee [basicsal=" + basicsal + ", bonus=" + bonus + "]";
	}

	public double calculatebonus() {
		return basicsal*bonus;
	}

	 

}
