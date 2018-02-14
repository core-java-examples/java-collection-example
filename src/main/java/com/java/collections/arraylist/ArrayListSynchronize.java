package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronize {
	public static void main(String[] args) {

		List<String> synList= Collections.synchronizedList(new ArrayList<String>());
		synList.add("India");
		synList.add("Pakistan");
		synList.add("Afganisthan");
		synList.add("Sri Lanka");
		synList.add("Bangladesh");
		System.out.println("ICC Cricket Team form Asia");
		synchronized(synList) {
			Iterator<String> iterator=synList.iterator();
			while (iterator.hasNext()){
				System.out.println(iterator.next());
			}
		}
		
	}

	

}
