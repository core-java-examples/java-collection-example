package com.java.collections.arraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListCopyOnWrite {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> copylist= new CopyOnWriteArrayList<String>();
		copylist.add("India");
		copylist.add("Pakistan");
		copylist.add("Afganisthan");
		copylist.add("Nepal");
		System.out.println("-----------Country List Asia------------");
		Iterator<String> iteratorList=copylist.iterator();
		while(iteratorList.hasNext())
		{
		System.out.println(iteratorList.next());	
		}	
	}

}
