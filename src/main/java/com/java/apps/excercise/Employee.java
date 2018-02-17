package com.java.apps.excercise;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer EmpId;
	private String  EmpName;
	private Integer EmpAge;
	private Double  EmpSalary;
	private String  EmpCity;
	
	public String toString() {
		return String.format("Employee [EmpId=%s, EmpName=%s, EmpAge=%s, EmpSalary=%s, EmpCity=%s]", EmpId, EmpName,
				EmpAge, EmpSalary, EmpCity);
	}

	public Employee() {
		
	}

	public Employee(Integer empId, String empName, Integer empAge, Double empSalary, String empCity) {
		EmpId = empId;
		EmpName = empName;
		EmpAge = empAge;
		EmpSalary = empSalary;
		EmpCity = empCity;
	}

	public Integer getEmpId() {
		return EmpId;
	}

	public void setEmpId(Integer empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public Integer getEmpAge() {
		return EmpAge;
	}

	public void setEmpAge(Integer empAge) {
		EmpAge = empAge;
	}

	public Double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(Double empSalary) {
		EmpSalary = empSalary;
	}

	public String getEmpCity() {
		return EmpCity;
	}

	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}
	
	
	
	

}
