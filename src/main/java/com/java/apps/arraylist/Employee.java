package com.java.apps.arraylist;

import java.io.Serializable;

// pojo class: plain old java object : it never needs a thrid party libraray to compile itself. it only uses ur jdk .
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer age;
	private String name;
	private String city;
	private Double salary;

	@Override
	public String toString() {
		return String.format("Employee [id=%s, age=%s, name=%s, city=%s, salary=%s]", id, age, name, city, salary);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee() {
		
	}

	public Employee(Integer id, Integer age, String name, String city, Double salary) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
  
	

}
