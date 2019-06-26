package com.class17;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Create a method that will take a number and prints whether the number is even or odd.

		Task2 num = new Task2();
		num.oddOrEven(12);

	}

	void oddOrEven(int num) {
		
		if (num % 2 == 0) {
			
			System.out.println(num + " is Even");
		
		} else if (num % 2 == 1) {

			System.out.println(num + " is Odd");
		}
	}

}
