package com.java.apps.excercise;

import java.util.List;

public interface IEmployeeOps {
	
	public boolean add(Employee emp);
	public boolean delete(int empId);
	public void update(Employee emp);
	public Employee getEmployeeByID(int empId);
	public List<Employee> getEmployee();
	
	

}
