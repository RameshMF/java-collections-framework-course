package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		List<String> progLanguages = new ArrayList<>();
		progLanguages.add("Java");
		progLanguages.add("C");
		progLanguages.add("C++");
		progLanguages.add("Python");
		progLanguages.add("JavaScript");
		
		// getting listiterator 
		ListIterator<String> listIterator = progLanguages.listIterator();
		System.out.println("Forward Direction Iteration:");
		
		// hasNext()
		// next()
		while(listIterator.hasNext()){
			String element = listIterator.next();
			System.out.println(element);
		}
		
		System.out.println("Backward Direction Iteration:");
		// previousNext()
		// previous()
		while(listIterator.hasPrevious()){
			String element = listIterator.previous();
			System.out.println(element);
		}
	}

}
