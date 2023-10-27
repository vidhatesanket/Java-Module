package javaClassPractise;

import java.util.Scanner;

public class mainMethod {
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
	do{
		System.out.println("1. Add new Person\n 2. display all\n 3. display by id\n 4. update mobile by id");
		System.out.println("5. display by name\n6. exit\n choice: ");
		
		System.out.println("Enter the choice: ");
		 choice = sc.nextInt();
		switch(choice) {
		case 1:
			Userchoices.addStudent();
			 break;
		case 2:
			Userchoices.displayData();
//			System.out.println("Getter function in main");
//			Userchoices c=new Userchoices(23,"pranav","23423");
//			System.out.println(c.getter()); 
			break;
		case 3:
			System.out.println("Enter the integer id: ");
			int _id=sc.nextInt();
			Userchoices.displayById(_id);
			break;
		case 4:
			System.out.println("Enter the integer id for which you want to update number: ");
			int id2=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the mobile number : ");
			String number=sc.nextLine();
			Userchoices.updateNumberById(id2,number);
			break;
		case 5:
			System.out.println("Enter the name you want to search ");
			String input_name=sc.next();
			Userchoices.searchByName(input_name);
			break;
		default:
			System.exit(0);
		}
	}while(choice!=6);
		
		

	}
	
}
