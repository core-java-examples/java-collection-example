package com.java.apps.arraylist.example;

import java.util.List;

public interface IEmployeeOps {
	
	public boolean add(Employee emp);
	public boolean delete(int empId);
	public void update(Employee emp);
	public Employee getEmployeeById(int empId);
	public List<Employee> getEmployee();
	

}
