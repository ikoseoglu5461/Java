package com.class34;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program to check which employee gets highest salary use hashmap
		 * employee name as key and salary amount as the value. Output example: John
		 * Smith=100000.
		 * 
		 */

		Map<String, Integer> person = new HashMap<>();

		person.put("Ali", 90000);
		person.put("Veli", 80000);
		person.put("Alex", 100000);
		person.put("Ahmed", 85000);
		person.put("Smith", 70000);

		
		//int maxSalary=Integer.MIN_VALUE;
		int maxSalary = 0;
		String key = null;
		for (Map.Entry<String, Integer> entry : person.entrySet()) {
			if (entry.getValue() > maxSalary) {
				maxSalary = entry.getValue();
				key=entry.getKey();
			}
		}
		System.out.println(maxSalary+" belongs to "+key);
	}

}
