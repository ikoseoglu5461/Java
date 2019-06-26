package com.class11;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Create an array of american cars, german cars, korean cars, italian cars.
		 * Then retrieve all values from that array
		 */
		String [] [] car= {
				
				{"American Cars:", "Ford", "Chevrolet", "GMC", "Buick", "Mercury"},
				{"Germany Cars:", "BMW", "Mercedes", "Opel"},
				{"Korean Cars:", "Hyundai", "Kia"},
				{"Italian Cars:", "Lamborgin", "Ferrari"}};
		
		for (int i=0; i<car.length; i++) {
			for (int j=0; j<car[i].length; j++) {
				System.out.print(car[i][j]+" ");
			}
			System.out.println();
		}
	
		}
	}


