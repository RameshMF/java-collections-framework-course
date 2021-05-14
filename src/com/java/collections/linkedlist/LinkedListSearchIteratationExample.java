package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIteratationExample {

	public static void main(String[] args) {
		
		 LinkedList<String> progLangs = new LinkedList<>();

		  progLangs.add("C"); // 0 
		  progLangs.add("C++"); // 1
		  progLangs.add("Core Java"); // 2
		  progLangs.add("Java EE"); // 3
		  progLangs.add("Spring Framework"); // 4
		  progLangs.add("Spring Framework"); // 5
		  progLangs.add("Hibernate Framework");
		  
		  boolean result = progLangs.contains("C");
		  System.out.println(" result = " + result);
		  
		// Find the index of the first occurrence of an element in the LinkedList
		  int index = progLangs.indexOf("Core Java");
		  System.out.println("index = " + index);
		  
		  // Find the index of the last occurrence of an element in the LinkedList
		  int lastIndex  = progLangs.lastIndexOf("Spring Framework");
		  System.out.println("lastIndex => " + lastIndex);
		  
		  // iterator
		  Iterator<String> iterator = progLangs.iterator();
		  while (iterator.hasNext()) {
			String prog = (String) iterator.next();
			System.out.println(prog);
		   }
		  // forEach
		  progLangs.forEach((element) -> {
			 System.out.println(element); 
		  });
		  // for each advanced loop
		  for(String e : progLangs){
			  System.out.println(e);
		  }
		  // simple for loop
		
	}

}
