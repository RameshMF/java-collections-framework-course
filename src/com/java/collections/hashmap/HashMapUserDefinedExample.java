package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {
	public static void main(String[] args) {
		
		// create hashmap
		
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		
		studentMap.put(1, new Student("Ramesh", "Fadatare"));
		studentMap.put(2, new Student("Tony", "Stark"));
		studentMap.put(3, new Student("umesh", "fadatare"));
		
		System.out.println(studentMap.values());
		
		
	}
}
