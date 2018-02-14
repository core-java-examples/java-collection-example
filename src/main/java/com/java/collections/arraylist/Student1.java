package com.java.collections.arraylist;

import java.util.Comparator;

public class Student1 {
	
	private int rollno;
	private String name;
	private int age;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	/*public int compareTo(Student1 rollno) {
		// TODO Auto-generated method stub
		//return 0;
		return this.rollno - rollno.getRollno();
	}*/


	public Student1(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public static Comparator<Student1> stdname=new Comparator<Student1>() {
		public int  compare(Student1 s1, Student1 s2)
		{
			String name1=s1.getName();
			String name2=s2.getName();
			
			return name1.compareTo(name2);
			
		}
		
	};
	
	public static Comparator<Student1> stdrollno=new Comparator<Student1>() 
	{
		public int compare(Student1 s1, Student1 s2)
		{
			int rollno1 =s1.getRollno();
			int rollno2 =s2.getRollno();
			return rollno1-rollno2;
			
		}
	};
	
}
