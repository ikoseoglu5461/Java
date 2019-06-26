package com.class14;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] array = { 11, 32, 43, 14, 55, 16, 47, 51, 39, 61 };

		int largest = array[0];
		int secondLargest = array[0];

		System.out.println("The array numbers are:");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " "); }

		for (int i = 0; i < array.length; i++) {

			if (array[i] > largest) {

				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest) {
				secondLargest = array[i];

			}

		}
		System.out.println("Second largest number is:" + secondLargest);
	}

}
