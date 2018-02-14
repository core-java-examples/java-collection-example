
package com.java.collections.arraylist;

public class Student implements Comparable<Student> {
	
	private int rollno;
	private String studentname;
	private int age;

	public Student(int rollno, String studentname, int age) { // altt+shift+s+o
		//super();
		this.rollno = rollno;
		this.studentname = studentname;
		this.age = age;
	} 
	
// alt+shift+s+r - getter & setter
	
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
	 * @return the studentname
	 */
	
	public String getStudentname() {
		return studentname;
	}
	
	/**
	 * @param studentname the studentname to set
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
	 * @param age the age to set
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */

	public int compareTo(Student stdage) {
		// TODO Auto-generated method stub
		//int stdage=((Student) std).getAge();
		//return this.age-stdage;
		return this.age - stdage.getAge();
	}

	
	
	@Override
	public String toString() {// alt+shift+s+s
		return "Student [rollno=" + rollno + ", studentname=" + studentname + ", age=" + age + "]";
	}



	
}
