package com.class31;

import java.util.ArrayList;

public class DrinkArraylist {

	public static void main(String[] args) {
		/*
		 * Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
		 */

		ArrayList<String> drinks=new ArrayList<String>();
		
		drinks.add("soda");
		drinks.add("coke");
		drinks.add("water");
		drinks.add("milk");
		
		
		
		 for (int i = 0; i <drinks.size(); i++) {

	            String drink = drinks.get(i);
	            if (drink.contains("a") || drink.contains("e")) {
	               drinks.set(i, "water");
	            }
	        }
	        System.out.println(drinks);
	    }

	}