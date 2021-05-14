package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

	public static void main(String[] args) {
		
		// create a HashSet using the HashSet() constructor 
		// add new elements to it using the add() method.
		
		// unordered collection
		Set<String> programmingLanguages = new HashSet<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Scala");
		programmingLanguages.add("JavaScript");
		
		System.out.println(programmingLanguages);
		
		// let's add duplicate element
		programmingLanguages.add("Java");

		System.out.println(programmingLanguages);
	}

}
