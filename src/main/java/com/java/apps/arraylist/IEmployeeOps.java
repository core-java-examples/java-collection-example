package com.java.apps.arraylist;

import java.util.List;

public interface IEmployeeOps {
   
	public boolean add(Employee emp);
	public void update(Employee emp);
	public boolean delete(int empId);
	public Employee getEmployeeById(int id);
	public List<Employee> getEmployees();
	
}
