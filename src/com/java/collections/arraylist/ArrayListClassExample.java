package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

//How to create an ArrayList using the ArrayList() constructor.
//Add new elements to an ArrayList using the add() method.
public class ArrayListClassExample {

	public static void main(String[] args) {
		
		// created arraylist object
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		
		System.out.println(fruits);
	}
}
