package dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmpDaoImpl implements EmpDao{

	static List<Employee> elist;
	static {
	elist=new ArrayList<>();
		elist.add(new Employee(12,"abc",2523));
		elist.add(new Employee(13,"lmn",5643));
		elist.add(new Employee(14,"xyz",7667));
		elist.add(new Employee(15,"pqr",9483));
	}
	//Deserialization
		@Override
		public void readFile() {
			File f=new File("empdata.txt");
			if(f.exists()) {
				try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empdata.txt"));){

					while(true) {
						Employee e=(Employee)ois.readObject();
						elist.add(e);
					}
					
				}catch(EOFException e) {
					System.out.println("Reached to end of file");
					
				}catch(IOException|ClassNotFoundException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(elist);
			}
			
		}
		
		//Serialization
		@Override
		public void writeDataIntoFile() {
	
				try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empdata.txt"));){
					for(Employee e:elist) {
						oos.writeObject(e);
					}
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
				
		}

		@Override
		public List<Employee> displayAll() {
			return elist;
			
		}
}
