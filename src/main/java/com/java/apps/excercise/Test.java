package com.java.apps.excercise;

public class Test {
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		IEmployeeOps iemp=new EmployeeOpsImpl();
		boolean flag= iemp.add(emp);
		System.out.println(flag);
	    // flag=iemp.add(null);
		//System.out.println(flag);

		
	}

}
