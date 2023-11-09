import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		
		//Reading the file
		try {
			File f=new File("InputFile.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNext()) {
				String result=sc.nextLine();
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		//Opening file in write mode
		try {
			Scanner sc2 = new Scanner(System.in);
			FileWriter f= new FileWriter("InputFile.txt",true);
			BufferedWriter bw=new BufferedWriter(f);
			System.out.println("Enter the text that you want to write in it");
			String input=("\n"+sc2.nextLine());
		
			bw.write(input);
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
