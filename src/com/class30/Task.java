package com.class30;

import java.util.ArrayList;

public class Task {
	public static void main(String[] args) {
		/*
		 * Create a generic ArrayList that will store 5 names into it. Find out whether
		 * the given ArrayList is empty or not? Check whether the specific name is
		 * present in an ArrayList or not? Find the size of your arrayList and print all
		 * values from that
		 */

		ArrayList<String> names = new ArrayList<String>();

		names.add("Ali");
		names.add("Veli");
		names.add("Ismail");
		names.add("Asim");
		names.add("Fatih");

		System.out.println("Is the array list empty?" + names.isEmpty());
		System.out.println("Is the array list contain Ismail name:" + names.contains("Ismail"));
		System.out.println("Array size:" + names.size());

		for (String name : names) {
			System.out.println(name);
		}
	}

}
