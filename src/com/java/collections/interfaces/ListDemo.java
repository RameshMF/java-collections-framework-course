package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// List allows you to add duplicate elements
		list.add("element1");
		list.add("element1");
		list.add("element2");
		list.add("element2");
		System.out.println(list);
		
		// List allows you to have ‘null’ elements.
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		// insertion order
		list.add("element1"); // 0
		list.add("element2"); // 1
		list.add("element4"); // 2
		list.add("element3"); // 3
		list.add("element5"); // 4
		
		System.out.println(list);
		
		// access elements from list
		
		System.out.println(list.get(0));
		System.out.println(list.get(4));

	}
}
