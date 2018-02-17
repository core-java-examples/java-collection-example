package com.java.apps.excercise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOpsImpl implements IEmployeeOps {

	List<Employee> emps=new ArrayList<>();
	
	public boolean add(Employee emp) {
		boolean isExits=false;
		if(emp==null)
		{
			throw new IllegalArgumentException();
		}
		
		for(Employee e:emps)
		{
			if(e.getEmpId().equals(emp.getEmpId()))
			{
				isExits=true;
				break;
			}
		}
		if(isExits==false)
		{
			return emps.add(emp);
		}
		return false;
	}


	public boolean delete(int empId) {
		boolean deletesuccess=false;
		for(Employee e :emps)
		{
			if(e.getEmpId().equals(empId)) 
			{
				emps.remove(e);
				deletesuccess=true;
				break;
				
			}
		}
		
		return deletesuccess;
	}


	public void update(Employee emp) {
	}


	public Employee getEmployeeByID(int empId) {
		Employee emp=null;
		for(Employee e:emps)
		{
			if(e.getEmpId().equals(empId))
			{
				emp=e;
				break;
				
			}
		}
		return emp;
	}

	public List<Employee> getEmployee() {
		return emps;
	}

	
	
	

}
