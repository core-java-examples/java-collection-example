package com.java.collections.arraylist;

import java.util.ArrayList;

public class ArraylistAdd {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Gunajit");
		list.add("Ashish");
		System.out.println("Output after add: " + list);
		list.add(2, "Kakul");
		list.add(3, "Nayan");
		System.out.println("After Index add:" + list);

		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		System.out.println("Value of 10 multiple " + number);
	}

}
