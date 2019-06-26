package com.class12;

public class Recap {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3 }, // 1 array that stored with index 0
						{ 10, 20, 30 }, // 2 array with index 1
						{ 100, 200, 300 } // 3 array with index 2
		};

		// how many total arrays

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) { // 0 //1 //2

				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------For each Loop---------------");
		// Loop through each single array
		
		for (int[] singleArray : array) {

			for (int numbers : singleArray) {  //{1,2,3}

				System.out.print(numbers + " ");
			}
			System.out.println();
		}
	}
}