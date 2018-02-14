package com.java.collections.arraylist;
import java.util.*;
public class ArrayListExample2 {
   @SuppressWarnings("serial")
public static void main(String args[]) {
	   ArrayList<String> cities = new ArrayList<String>() {{
		   add("Delhi");
		   add("Agra");
		   add("Chennai");
		   }};
	  System.out.println("Content of Array list cities:"+cities);
   }
}