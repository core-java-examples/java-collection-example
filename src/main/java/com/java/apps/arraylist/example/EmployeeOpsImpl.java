package com.java.apps.arraylist.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOpsImpl implements IEmployeeOps {
	List<Employee> emps = new ArrayList<>();

	@Override
	public boolean add(Employee emp) {

		boolean isExits = false;
		if (emp == null) {
			throw new IllegalArgumentException();
		}
		for (Employee e : emps) {
			if (e.getEmpId().equals(emp.getEmpId())) {
				isExits = true;
				break;

			}

		}
		if (isExits == false) {
			return emps.add(emp);
		}

		return false;
	}

	@Override
	public boolean delete(int empId) {
		
	boolean deleteSuccess=false;
	for(Employee e:emps)
	{
		if(e.getEmpId().equals(empId))
		{
			emps.remove(e);
			deleteSuccess=true;
			break;
		}
		
	}
		return deleteSuccess;
	}

	@Override
	public void update(Employee emp) {
	}

	@Override
	public Employee getEmployeeById(int empId) {
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

	@Override
	public List<Employee> getEmployee() {
		return emps;
	}

}
