package com.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/* Let user define a range of numbers to print */

		Scanner myScan;
		int number;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a starting number");
		int startNumber = scan.nextInt();

		System.out.println("Please enter ending number");
		int endNumber = scan.nextInt();

		for (int i = startNumber; i <= endNumber; i++) {
			System.out.println(i);
		}
	}

}
