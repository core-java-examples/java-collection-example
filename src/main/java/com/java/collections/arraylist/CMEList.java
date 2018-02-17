package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CMEList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>(); // set , entry
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        // modCount number of changes in structure, modCount increase
        Iterator<String> it=list.iterator();// expectedModcount =4
        while(it.hasNext())
        {
        	String val=it.next();
        	if(val.equals("c")) {
        	//it.remove();// remove never throws CME
        		//list.add("d"); // CME
        		list.remove("d");// NO CME, 3 -> 2
        	}
        	System.out.println(val);
        	
        }
	}

}
