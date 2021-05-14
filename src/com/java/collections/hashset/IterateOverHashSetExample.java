package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//1. Iterate over a HashSet using simple for-each loop.
//2. Iterate over a HashSet using iterator().
//3. Iterate over a HashSet using Java 8 forEach and lambda expression.

public class IterateOverHashSetExample {

	public static void main(String[] args) {

		// creating HashSet
		Set<String> programmingLanguages = new HashSet<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("PHP");
		
//		//1. Iterate over a HashSet using simple for-each loop.
//		for (String progLag : programmingLanguages) {
//			System.out.println(progLag);
//		}
//		
//		//2. Iterate over a HashSet using iterator().
//		Iterator<String> iterator = programmingLanguages.iterator();
//		while (iterator.hasNext()) {
//			String proLang = (String) iterator.next();
//			System.out.println(proLang);
//		}
		
		//3. Iterate over a HashSet using Java 8 forEach and lambda expression.
		programmingLanguages.forEach(proLang -> {
			System.out.println(proLang);
		});
	}

}
