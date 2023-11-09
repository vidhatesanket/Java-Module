package dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmpDao {

	void readFile();

	void writeDataIntoFile();

	List<Employee> displayAll();
	
}
