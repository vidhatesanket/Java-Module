package com.demo.dao;
import com.demo.beans.Employee;
import java.util.List;

public interface EmployeeDao {
	
	void save(Employee e);
	boolean removeById(int did);
	boolean updateBySal(int id,double sal);
	List<Employee> getAll();
	Employee getById(int id);

}



