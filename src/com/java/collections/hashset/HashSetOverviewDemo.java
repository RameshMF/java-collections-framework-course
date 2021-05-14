package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetOverviewDemo {

	public static void main(String[] args) {
		//nullValueDemo();
		//duplicateValueDemo();
		unorderedDemo();
	}

	// Set can contain one null value
	private static void nullValueDemo() {
		Set<String> set = new HashSet<>();
		set.add(null);
		set.add(null);
		System.out.println(set.toString());
	}

	// it is not contain duplicate elements
	private static void duplicateValueDemo() {
		Set<String> set = new HashSet<>();
		set.add("element1");
		set.add("element1");
		// displays only one element
		System.out.println(set.toString());
		
		
	}

	// it is unordered collection
	private static void unorderedDemo() {
		Set<String> set = new HashSet<>();
		set.add("element1");
		set.add("element2");
		set.add("element4");
		set.add("element5");
		set.add("element7");
		set.add("element6");
		// displays only one element
		System.out.println(set.toString());
	}
}
