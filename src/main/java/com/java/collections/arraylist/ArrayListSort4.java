package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort4 {
	public static void main(String[] args) {
		
		ArrayList<Student1> arraylist = new ArrayList<Student1>();
		arraylist.add(new Student1(2, "gunajit", 27));
		arraylist.add(new Student1(3, "Akash", 29));
		arraylist.add(new Student1(6, "Ashish", 24));
		
		System.out.println("Student1 Name Sorting:");
		
		Collections.sort(arraylist, Student1.stdname);
		
		
		for(Student1 std: arraylist)
		{
			System.out.println(std);
		}
	
		System.out.println("Student1 Roll No Sorting");
		
		Collections.sort(arraylist, Student1.stdrollno);
		
		for(Student1 stdroll :arraylist)
		{
			System.out.println(stdroll);
		}
		
	}

}
