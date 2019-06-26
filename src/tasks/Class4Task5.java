package tasks;

import java.util.Scanner;

public class Class4Task5 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */

		int workYear, annualSalary;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter workYear");
		workYear = scan.nextInt();
		System.out.println("Please enter annual salary");
		annualSalary = scan.nextInt();

		if (workYear >= 5) {
			System.out.println("Eligible for the bonus");

			if (annualSalary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else
			System.out.println("NOT eligible for the bonus");

	}

}
