package com.java.apps.arraylist.example;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 2L;
	private Integer empId;
	private String empName;
	private Integer empAge;
	private String empCity;
	private Double empSalary;
	
	@Override
	public String toString() {
		return String.format("Employee [empId=%s, empName=%s, empAge=%s, empCity=%s, empSalary=%s]", empId, empName,
				empAge, empCity, empSalary);
	}

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, Integer empAge, String empCity, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empCity = empCity;
		this.empSalary = empSalary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
	

}
