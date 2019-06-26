package com.class11;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * Create an array of cities: North America Contries, South America Countries, Europe Countries, 
		 * Asian Countries, African Countries.
		 * Then print all values from that array.
		 */
		
		String [] [] countries= {
				
				{"North America Contries:", "Canada", "USA"},
				{"South America Countries:", "Colombia", "Mexico", "Peru"},
				{"Europe Countries:", "Germany", "France", "Holland",},
				{"Asian Countries:", "Lamborgin", "Ferrari"},
				{"African Countries:", ""}};
		
		for (int i=0; i<countries.length; i++) {
			for (int j=0; j<countries[i].length; j++) {
				System.out.print(countries[i][j]+" ");
			}
			System.out.println();
		}
	
		}
	}

	
