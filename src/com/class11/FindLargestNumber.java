package com.class11;

public class FindLargestNumber {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10000000 };

		int largest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println("The largest number is " + largest);
	}

}
