package com.java.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateHashMapExample {
	public static void main(String[] args) {
		
		// example to map numbers to string
		Map<String, Integer> numberMapping = new HashMap<>();
		
		// add key-value to map
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		numberMapping.put("Five", 5);
		
		numberMapping.put(null, 7);
		
		System.out.println(numberMapping);
		
		// Check if a HashMap is empty
		System.out.println(numberMapping.isEmpty());
		
		// Find the size of a HashMap
		
		System.out.println(numberMapping.size());
		
		// Check if a key exists in the HashMap
		
		if(numberMapping.containsKey("Four")){
			System.out.println("Exist");
		}else{
			System.out.println("Not Exist");
		}
		
		// Check if a value exists in a HashMap
		
		if(numberMapping.containsValue(4)){
			System.out.println("Exist");
		}else{
			System.out.println("Not Exist");
		}
		
		// get value by key
		
		Integer v1 = numberMapping.get("One");
		System.out.println(v1);
		
		
		// how to remove keys from hashmap
		
		numberMapping.remove("One");
		System.out.println(numberMapping);

		// get only keys from hashmap
		
		Set<String>  keys = numberMapping.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = numberMapping.values();
		System.out.println(values);
		
		// different ways to iterate over hashmap
		
		// for each method
		for(Map.Entry<String, Integer> entry: numberMapping.entrySet()){
			System.out.println("key ->" + entry.getKey() + " value->" + entry.getValue());
		}
		
		// using iterator
		Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
		while(iterator.hasNext()){
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("key ->" + entry.getKey() + " value-> " + entry.getValue());
		}
		
		// hashmap using java 8 forEach
		numberMapping.forEach((K, V)-> {
			System.out.println(" K "+ K);
			System.out.println(" V "+ V);
		});
	}
}
