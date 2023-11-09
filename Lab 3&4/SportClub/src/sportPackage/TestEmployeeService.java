package sportPackage;
import java.time.LocalDate;
import java.util.Scanner;

public class TestEmployeeService {
	
	static Employee[] earr;
	static int cnt;
	
	static {
		cnt=0;
		earr=new Employee[100];
	}
		
		

	public static void addnewPerson() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter mobile:");
			String mobile=sc.nextLine();
			System.out.println("Enter email:");
			String email=sc.nextLine();
			System.out.println("Enter dept:");
			String dept=sc.nextLine();
			System.out.println("Enter desg:");
			String desg=sc.nextLine();
			System.out.println("Enter date of joining:");
			System.out.println("Enter Year:");
			int y=sc.nextInt();
			System.out.println("Enter Month:");
			int m=sc.nextInt();
			System.out.println("Enter Day:");
			int d=sc.nextInt();
			LocalDate doj=LocalDate.of(y, m, d);
			System.out.println("Press 1 for SalariedEmployee\nPress 2 for ContractEmployee\nPress 3 for Vendor");
			int echoice=sc.nextInt();
			switch (echoice) {
			case 1: {
					System.out.println("Enter Basic Salary:");
					double basicsal=sc.nextInt();
					System.out.println("Enter Bonus:");
					double bonus=sc.nextInt();
					earr[cnt] = new SalariedEmployee(cnt,name,mobile,email,dept,desg,doj,basicsal,bonus);
					cnt++;
					break;
			}
			case 2: {
				System.out.println("Enter Hours:");
				double hrs=sc.nextInt();
				System.out.println("Enter Charges:");
				double charges=sc.nextInt();
				earr[cnt] = new ContractEmployee(cnt,name,mobile,email,dept,desg,doj,hrs,charges);
				cnt++;
				break;
			}
			case 3: {
				System.out.println("Enter Number of Employee:");
				Double no_of_emp=sc.nextDouble();
				System.out.println("Enter Amount:");
				Double amount=sc.nextDouble();
				earr[cnt] = new Vendor(cnt,name,mobile,email,dept,desg,doj,no_of_emp,amount);
				cnt++;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + echoice);
			}
			
		}



	public static void displayall() {
		
		for(int i=0;i<cnt;i++) {
			System.out.println(earr[i]);
			System.out.println();
		}
		
	}



	public static int Searchbyid(int pid) {
		int pos=-1;
		for(int i=0;i<cnt;i++)
		{
			if(earr[i].getId()==pid) {
				pos=i;
				return pos;
			}
		}
		return -1;
	}



	public static void displayiddetails(int pos) {
		if(pos!=-1)
		{
			System.out.println(earr[pos]);
		}
		else {
			System.out.println("Id not found");
		}
	}



	public static double CalculateSalary(int pid) {
		int pos=Searchbyid(pid);
		if(pos!=-1)
		{
			 return earr[pos].calculateSal();
		}
		return -1;
		
	}



	public static boolean modifysal(int pid, double s) {
		int pos=Searchbyid(pid);
		if(pos!=-1) {
			if(earr[pos] instanceof SalariedEmployee) {
				((SalariedEmployee)earr[pos]).setBasicsal(s);
		        
		    }else if(earr[pos] instanceof ContractEmployee) {
		    	((ContractEmployee)earr[pos]).setCharges(s);
		    }else {
		    	((Vendor)earr[pos]).setAmount(s);
		    }
			return true;
		}
		else
			return false;
	}



	public static boolean modifybonus(int pid, double s) {
		int pos=Searchbyid(pid);
		if(pos!=-1) {
			if(earr[pos] instanceof SalariedEmployee) {
				((SalariedEmployee)earr[pos]).setBonus(s);
		        
		    }else if(earr[pos] instanceof ContractEmployee) {
		    	((ContractEmployee)earr[pos]).setHrs(s);
		    }else {
		    	((Vendor)earr[pos]).setNo_of_emp(s);
		    }
			return true;
		}
		else
			return false;
	}


	public static double CalculateBonus(int pid) {
		int pos=Searchbyid(pid);
		if(earr[pos] instanceof SalariedEmployee)
		{
			return ((SalariedEmployee)earr[pos]).calculatebonus();
		}
		return -1;
		
	}



	public static Employee[] Searchbyname(String name) {
		Employee[] arr=new Employee[cnt];
		int count=0;
		for(int i=0;i<cnt;i++)
		{ 
			if(earr[i].getName().equals(name))
			{
				System.out.println("in if"+i);
				arr[count]=earr[i];
			    count++;
			}
			
		}
		return arr;
		
	}
	
}
