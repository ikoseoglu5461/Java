package com.class04;

public class NestedIfAgain {

	public static void main(String[] args) {
		/*
		 * declare variable for gpa and having a diploma if user has a diploma-->
		 * congratulations--> if gpa is higher than 3.5--> hire person else do not hire
		 */

		double gpa = 3.4;
		double expectedGpa = 3.5;
		boolean hasDiploma = true;

		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa > expectedGpa) {
				System.out.println("You are hired");
			} else {
				System.out.println("Unfortunely we can not hore you");
			}

		} else {
			System.out.println("Please get your degree");
		}
	}

}
