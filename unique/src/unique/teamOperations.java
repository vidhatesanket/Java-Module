package unique;
import java.util.*;

public class teamOperations {
	private static int cnt;
	static Team tarr[]=new Team[3]; 
	static {
		cnt=0;
	}
	
	public static void addNewTeam(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Team number");
		int tno = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Team name");
		String tname=sc.nextLine();
		
		System.out.println("Enter the captain name");
		String cname=sc.nextLine();
		
		System.out.println("Enter the captain number");
		int cnumber=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the captain skills");
		String cskill=sc.nextLine();
		
		player captain=new player(cname,cnumber,cskill);
		
		player plist[]=new player[3];  //Array of object for storing the player details
		for(int i=0; i < 3; i++) {
			System.out.println("Enter the player name");
			String pname=sc.nextLine();
			
			System.out.println("Enter the player number");
			int pnumber=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the player skills");
			String pskill=sc.nextLine();
			
			plist[i]=new player(pname,pnumber,pskill);
		}
		
	    //Array of object for storing the team details
		tarr[cnt]=new Team(tno,tname,captain,plist);
		cnt++;
	}

	public static void displayAll() {
		for(int i=0; i < cnt; i++) {
			System.out.println("Showing team list: ");
			System.out.println(tarr[i]);
		}
		
	}
}
