package com.class14;

public class Tasksss {

	public static void main(String[] args) {

		// 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings without a temporary variable?

		// 2.Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		// 3. Find out how many alpha characters present in a string?

		// 4.How to find out the part of the string from a string? What is substring?
		// Find number of words in string?

		// 5. Write a java program to reverse String? Reverse a string word by word?

		// 1.
		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a= " + a + " b= " + b);

		String x = "Ali";
		String y = "Veli";
		
		x=x+y;
		y = x.substring(0, x.length()-y.length());
		
		x =x.substring(y.length());
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		

		// 2.
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int largest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		System.out.println("Maximum number in the array:" + largest);
		
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Minumum number in the array:" + min);
		
		
}
}