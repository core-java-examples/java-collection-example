package com.java.collections.arraylist;
import java.util.*;

public class ArrayListExample {
   public static void main(String args[]) {
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	  ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
	  obj.add("Ajeet");
	  obj.add("Harry");
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");

	  /* Displaying array list elements */
	  System.out.println("Currently the array list has following elements:"+obj);

	  /*Add element at the given index*/
	  obj.add(0, "Rahul");
	  obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
	  obj.remove("Chaitanya");
	  obj.remove("Harry");

	  System.out.println("Current array list is:"+obj);

	  /*Remove element from the given index*/
	  obj.remove(1);

	  System.out.println("Current array list is:"+obj);
	  
	  /* Practice Code */
	  ArrayList<String> arr= new ArrayList<String>();
	  /*Add */
	  System.out.println("India One Day Team Against SA");
	  arr.add("Virat");
	  arr.add("Rohit");
	  arr.add("Shikhar");
	  arr.add("Dhoni");
	  arr.add("Rahane");
	  arr.add("Dhoni");
	  arr.add("Bhuvi");
	  arr.add("Bumrah");
	  System.out.println("Output Add: "+arr);
	  /* Add Index */
	  arr.add(1, "Iyar");
	  System.out.println("Output after Index add:"+arr);
	  /* Remove */
	  arr.remove("Virat");
	  System.out.println("Output After Remove: "+arr);
	  /* Remove Index*/
	  arr.remove(0);
	  System.out.println("Output After Remove Index:"+arr);
      //arr.get(3);
      //System.out.println("Output Get:"+arr.get(3));
     
      System.out.println(arr.contains("Rohit"));
     
      System.out.println(arr.isEmpty());
      arr.size();
      System.out.println(arr.size());
      
      //arr.clear();
      //System.out.println(arr);
      
      arr.set(2, "Tom");
      System.out.println("output after set:"+arr);
      
      int pos = obj.indexOf("Tom");
      System.out.println(pos);
      
      }
}