package com.class04;

public class NestedIf {

	/*
	 * write a program to work eligibility if user is younger than <16-->not allowed
	 * to work otherwise--->allow to work. if user younger than 64--> go to work
	 * otherwise ---> enjoy your life
	 */

	public static void main(String[] args) {

		int age = 18;
		int eligibleAge = 16;
		int retirementAge = 64;

		if (age < eligibleAge) {
			System.out.println("You are too young, no work for you");
		}else {
			System.out.println("You are eligible to work");
			if (age < retirementAge) {
				System.out.println("Go work hard");

			} else {
				System.out.println("Please enjoy your life. You don't need to work");
			}
		}
	}
}
