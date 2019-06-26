package com.class09;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Ask a user to input a leap year. Give the user 10 chances to enter a correct
		 * leap year. As soon as the user enters the correct leap year exit the loop.
		 */

		Scanner scan;
		int leapYear;

		scan = new Scanner(System.in);

		for (int x = 1; x <= 10; x++) {

			System.out.println("Please enter your guess leap year");
			leapYear = scan.nextInt();

			// if year is divisible by 400--->leap year
			// if year is divisible by 100--->not a leap year
			// if year is divisible by 4---> leap year

			if (leapYear % 400 == 0) {
				System.out.println("Year is a leap year");
				break;
			
			} else if (leapYear % 4 == 0 && leapYear % 100 != 0) {
				System.out.println("Year is a leap year");
				break;

			} else {
				System.out.println("Year is NOT a leap year");

			}
		}
	}
}
