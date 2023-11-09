package sportPackage;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. Add new Person\n2. Display All\n3. Search by id\n4. Calculate Salary by id\n5. Modify Salary/Charges/Amount\n6. Modify Bonus/Hours/no. of Employees\n7. Calculate Bonus\n8. Search by name\n9. Exit");
		System.out.print("Enter Choice:");
		choice=sc.nextInt();
		switch (choice) {
		case 1:{
				TestEmployeeService.addnewPerson();
				break;
			   }
		case 2:{
				TestEmployeeService.displayall();
			break;
		}
		case 3:{
				System.out.println("Enter id: ");
				int pid=sc.nextInt();
				int pos=TestEmployeeService.Searchbyid(pid);
				TestEmployeeService.displayiddetails(pos);
				break;		
		}
		case 4:{
			System.out.println("Enter id: ");
			int pid=sc.nextInt();
			double salary=TestEmployeeService.CalculateSalary(pid);
			if(salary!=-1) {
		    	 System.out.println("Net Salary : "+salary);
		     }
		     else {
		    	 System.out.println("not found");
		     }
			break;		
		}
		case 5:{
				System.out.println("Enter id: ");
				int pid=sc.nextInt();
				System.out.println("Enter Salary/Charges/Amount to modify: ");
				double s=sc.nextDouble();
				boolean status=TestEmployeeService.modifysal(pid,s);
				if(status)
				{
					System.out.println("Modification done");
				}
				else {
					System.out.println("id not found");
				}
				break;
		}
		case 6:{
				System.out.println("Enter id: ");
				int pid=sc.nextInt();
				System.out.println("Enter Bonus/Hours/no. of Employee to modify: ");
				double s=sc.nextDouble();
				boolean status=TestEmployeeService.modifybonus(pid,s);
				if(status)
				{
					System.out.println("Modification done");
				}
				else {
					System.out.println("id not found");
				}
				break;
		}
		case 7:{
				System.out.println("Enter id: ");
				int pid=sc.nextInt();
				double bon=TestEmployeeService.CalculateBonus(pid);
				if(bon!=-1) {
			    	 System.out.println("Net Bonus : "+bon);
			     }
			    else {
			    	 System.out.println("Employee is not Salaried Employee OR id not found");
			    }
				break;
		}
		case 8:{
			System.out.println("Enter name: ");
			sc.nextLine();
			String name=sc.nextLine();
			boolean isNotEmpty = false;
			Employee[] plist=TestEmployeeService.Searchbyname(name);
			
			for(int i=0;i<plist.length-1;i++) {
				if (plist[i]!=null) {
					isNotEmpty = true;
					System.out.println(plist[i]);
				}
			}
			if (isNotEmpty == false) {
			      System.out.println("not found");
			}
			break;
		}
		case 9:{
			System.out.println("Thank you");
			break;
		}
		default:{
			System.out.println("Invalid choice");
		}
		}
		}while(choice!=9);
}
}
