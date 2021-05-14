package com.java.collections.linkedlist;

import java.util.LinkedList;

//How to get the first element in the LinkedList.
//How to get the last element in the LinkedList.
//How to get the element at a given index in the LinkedList.
// How to get all the elements from LinkedList

public class RetrieveLinkedListElementsExample {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("Pinaple");
		
		// Getting the first element in the LinkedList using getFirst()
		String firstelement = fruits.getFirst();
		System.out.println(" first element => " + firstelement);
		
		 // Getting the last element in the LinkedList using getLast()
		String lastElement = fruits.getLast();
		System.out.println(" last element => " + lastElement);

		// Getting the element at a given position in the LinkedList
		String element = fruits.get(1);
		System.out.println("element "+ element);
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
