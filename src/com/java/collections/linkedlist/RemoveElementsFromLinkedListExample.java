package com.java.collections.linkedlist;

import java.util.LinkedList;

//How to remove the first element in the LinkedList.
//How to remove the last element in the LinkedList.
//How to remove the first occurrence of a given element in the LinkedList.
//How to clear the LinkedList completely.
public class RemoveElementsFromLinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> fruitList = new LinkedList<>();
		fruitList.add("Apple");
		fruitList.add("banana");
		fruitList.add("mango");
		fruitList.add("Pinaple");

		System.out.println("Initial LinkedList = " + fruitList);
		
		 // Remove the first element in the LinkedList
		String element = fruitList.removeFirst();
		System.out.println(" after removing first element => " + fruitList);
		
		 // Remove the last element in the LinkedList
		fruitList.removeLast();
		System.out.println(" after removing last element => " + fruitList);
		
		fruitList.remove("banana");
		System.out.println(fruitList);
		
		fruitList.clear();
		
		System.out.println(fruitList);

	}

}
