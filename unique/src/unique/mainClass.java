package unique;
import java.util.*;

public class mainClass {
	public static void main(String arg[]){
		int choice=0;
		do{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Add new team\n 2. display all teams\n");
			System.out.println("3. search team by captain\n 4. exit\nchoice : ");
			System.out.println("Enter the choice: ");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					teamOperations.addNewTeam();
					break;
				case 2:
					teamOperations.displayAll();
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				default:
					System.out.println("Invalid choice!");
					System.exit(0);
			}
			
		}while(choice!=5);
		
	}
}
