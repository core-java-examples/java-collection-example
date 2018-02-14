package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort3 {

	public static void main(String[] args) {
		ArrayList<Student> arraylist=new ArrayList<Student>();
		arraylist.add(new Student(30,"virat",18));
		arraylist.add(new Student(35,"rohit",10));
		arraylist.add(new Student(32,"shikahr",99));
		arraylist.add(new Student(33,"dhoni",7));
		Collections.sort(arraylist);
		for(Student std: arraylist) {
			System.out.println(std);
		}
	} 

}
