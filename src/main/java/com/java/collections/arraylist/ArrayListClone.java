package com.java.collections.arraylist;

import java.util.ArrayList;

public class ArrayListClone {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("India");
		list.add("Pakistan");
		list.add("Bangladesh");
		list.add("Sri Lanka");
		
		System.out.println("List Output "+list);
		@SuppressWarnings("unchecked")
		
		ArrayList<String> list1=(ArrayList<String>)list.clone();
		System.out.println("After Copy List1 "+list1);
		list.add("Nepal");
		list.remove("India");
		list.remove(2);
		System.out.println("Original  List "+list);
		System.out.println("AFtre CLone list "+list1);
	}

}
