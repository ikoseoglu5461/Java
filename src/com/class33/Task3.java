package com.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a map of countries with its capital. Print all keys and values from a
		 * country map using for each loop and iterator. Print all values from a country
		 * map using for each loop and iterator.
		 */

		Map<String, String> map = new HashMap<>();
		map.put("Turkey", "Ankara");
		map.put("United States", "Washington");
		map.put("Russia", "Moscov");
		map.put("Azerbaycan", "Baku");
		map.put("Germany", "Berlin");

		Set<String> keys = map.keySet();
		System.out.println("--------Using for each loop--------");
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println();
		System.out.println("--------Using Iterator--------");
		Iterator<String> keysIt = keys.iterator();
		while (keysIt.hasNext()) {
			String key = keysIt.next();
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("-----------------------");
		for(Map.Entry<String, String> pair : map.entrySet()) {
			System.out.println(pair.getKey() + " : " + pair.getValue() );
		}

	}

}
