package com.java.apps.arraylist.example;

public class Test {
	public static void main(String[] args) {
		Employee emp=new Employee();
		EmployeeOpsImpl emplist=new EmployeeOpsImpl();
		boolean flag=emplist.add(emp);
		System.out.println(flag);
	}

}
