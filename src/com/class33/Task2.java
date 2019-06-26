package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {
		/*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). 
		 * Insert 7 entries with duplicate keys and values. 
		 * 
		 * >Check how many entries you have?
		 * >Update company on a 4th floor 
		 * >Remove company on the 7th floor 
		 * >Print your map
		 */
		
		Map<Integer, String> myMap=new HashMap<>();
		
		myMap.put(1,  "Google");
		myMap.put(2, "Syntax");
		myMap.put(3,  "BYAL");
		myMap.put(4,  "TD Bank");
		myMap.put(5,  "Apple");
		myMap.put(6,  "BH");
		myMap.put(7,  "Microsoft");
		
		//>Check how many entries you have?
		System.out.println(myMap.size());
		//>Update company on a 4th floor 
		myMap.replace(4, "Bank Of America");
		System.out.println(myMap);
		//>Remove company on the 7th floor 
		myMap.remove(7);
		System.out.println(myMap);
		//Final MyMap
		System.out.println("Final My Map: "+myMap);
		
	}

}
