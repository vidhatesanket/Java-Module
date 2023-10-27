package javaClassPractise;
import java.util.*;

public class Userchoices {
	
	private int id;
	private String name,number;
	static Userchoices arr_obj[]=new Userchoices[100];
	static int index;
	
	static {
		index=0;
	}
	
	Userchoices(int ID,String nm,String num){
		System.out.println("In para const");
		id=ID;
		name=nm;
		number=num;
	}
	
	//Taking input from the user
	public static void addStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter the Student Mobile number: ");
		String number=sc.nextLine();
		
		arr_obj[index]=new Userchoices(id,name,number);
		index++;
	}
	
	//Displaying the data
	
	public static void displayData() {
		for(int i=0; i < index; i++) {
				System.out.println(arr_obj[i]);
		}
	}
	
	
	//Displaying the details of the student according to the id
	public static void displayById(int Student_id) {
		for(int i=0; i < index; i++) {
			if(arr_obj[i].getID()==Student_id) {
				System.out.println(arr_obj[i]);
			}
			
		}
		System.out.println("ID not found!!");
		
	}
	
	//Setting new mobile number acc. to id
	public static void updateNumberById(int id2,String mNumber) {
		
		for(int i=0; i < index; i++) {
			if(arr_obj[i].getID()==id2) {
				arr_obj[i].setNumber(mNumber);
			}
		}		
	}
	
	//Search by name
	public static void searchByName(String input_name) {
		for(int i=0; i < index; i++) {
			if(arr_obj[i].getName().equals(input_name)) {
				System.out.println(arr_obj[i]);
			}
		}
	}
	
	
	
	//Getter method for the name
	public  String getter(){
		System.out.println("In getter");
		return name;
	}
	//Implicitly called by displayData() for each object
	
	public String toString() {
		return "id "+id+" Name : "+name+"Number: "+ number;
	}
	
	
	public int getID(){
		return id;
	}
	//Setter method for mobile number
	public  void setNumber(String numb){
		number=numb;
	}
	public String getName(){
		return name;
	}

	
}
