package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

//This example demonstrates how to create an ArrayList using the ArrayList() constructor 
//and add new elements to an ArrayList using the add() method.
public class CreateArrayListExample {
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>(); 
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);
	}
}
