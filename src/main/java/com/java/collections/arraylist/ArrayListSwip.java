package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListSwip {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("India");
		list.add("America");
		list.add("Pakisthan");
		System.out.println("Arraylsi: "+list);
		for(String temp:list)
		{
			System.out.println("Outpust Is: "+temp);
		}
		//Iterator<String> iterator=list.iterator();
		//int counter=1;
		//while (iterator.hasNext()) {
			//System.out.println(counter+".Output Before Swip: "+iterator.next());
			//counter++;
		//}
		
		Collections.swap(list, 1, 2);
		System.out.println("AFter Swap:");
		for(String temp:list)
		{
			System.out.println("Output Is: "+temp);
		}
	}

}
