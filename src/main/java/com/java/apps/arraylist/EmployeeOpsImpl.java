package com.java.apps.arraylist;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOpsImpl implements IEmployeeOps {

	List<Employee> emps=new ArrayList<>();
	public boolean add(Employee emp) {
		boolean isExist=false;
		if(emp==null)
		{
			throw new IllegalArgumentException();
		}
		for(Employee e: emps)
		{
			if(e.getId().equals(emp.getId()))
			{
				isExist=true;
				break;
			}
		}
		if(isExist==false) {
		return emps.add(emp);
		}
		return false;
	}

	public void update(Employee emp) {
	}

	public boolean delete(int empId) {
		boolean deleteSuccess=false;
		for(Employee e:emps)
		{
			//empId.equals()
			if(e.getId().equals(empId))
			{
				emps.remove(e);
				deleteSuccess=true;
				break;
			}
		}
		
		return deleteSuccess;
		
		
	}

	public Employee getEmployeeById(int id) {
		Employee emp=null;
		for(Employee e:emps)
		{
			//empId.equals()
			if(e.getId().equals(id))
			{
				emp=e;
				break;
			}
		}
		return emp;
	}

	public List<Employee> getEmployees() {
		return emps;
	}

}
