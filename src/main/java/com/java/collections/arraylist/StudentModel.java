package com.java.collections.arraylist;

public class StudentModel implements Comparable<Object> {

	private int rollno;
	private String studentname;
	private int age;

	// alt+shift+s+s
	@Override
	public String toString() {
		return "StudentModel [rollno=" + rollno + ", studentname=" + studentname + ", age=" + age + "]";
	}

	// altt+shift+s+c
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// altt+shift+s+o
	public StudentModel(int rollno, String studentname, int age) {
		super();
		this.rollno = rollno;
		this.studentname = studentname;
		this.age = age;
	}

	// shift+alt+s+v
//Override and implements
	
// alt+shift+s+r - getter & setter
	/**
	 * @return the rollno
	 */

	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno
	 *            the rollno to set
	 */

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * @return the studentname
	 */

	public String getStudentname() {
		return studentname;
	}

	/**
	 * @param studentname
	 *            the studentname to set
	 */
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	/**
	 * @return the age
	 */

	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
