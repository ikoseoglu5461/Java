package com.class33;

import java.util.*;

public class Task4 {

	public static void main(String[] args) {

		/*
		 * Create a map of Best Buy store. Place item id and item name into it. Example
		 * (7664847 = Printer, 7879885= TV etc ) Print all keys and values from a Best
		 * Buy map using EntrySet.
		 */

		Map<Integer, String> product = new LinkedHashMap<>();
		product.put(7664847, "Printer");
		product.put(7879885, "TV");
		product.put(7884994, "Projection");
		product.put(7809885, "PSP 2018");
		product.put(7879089, "Iphone");

		System.out.println(product);

		for (Map.Entry<Integer, String> entry : product.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println("-------------------------------");
		
		
		Iterator<Map.Entry<Integer, String>> productIterator = product.entrySet().iterator();
		while (productIterator.hasNext()) {
			Map.Entry<Integer, String> prod = productIterator.next();
			System.out.println(prod.getKey() + "=" + prod.getValue());
		}
	}
}
