package com.class03;

public class MultipleConditions {

	public static void main(String[] args) {
		/*
		 * Create a java program and declare int veriable that will hold a day. Based on
		 * the value of the varible your program should print the name of the day
		 */

		int day = 7;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday -fun day");
		} else if (day == 6) {
			System.out.println("Saturday -code day");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("I don't know what you mean");
		}

	}

}
