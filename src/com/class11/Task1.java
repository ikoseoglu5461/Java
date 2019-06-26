package com.class11;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops
		// print all values from the array.

		String[] made = { "Honda", "Toyota", "Ford", "Ferrari", "Kia", "Mazda" };

		for (int i = 0; i <= made.length - 1; i++) {
			System.out.println(made[i]);
		}

		for (String brand : made) {
			System.out.println(brand);
		}

	}

}
