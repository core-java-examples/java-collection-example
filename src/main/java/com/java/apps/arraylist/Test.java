package com.java.apps.arraylist;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();

		IEmployeeOps im = new EmployeeOpsImpl();
		boolean flag = im.add(emp);
		System.out.println(flag);
		flag = im.add(null);
		System.out.println(flag);
	}

}
