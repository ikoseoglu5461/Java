package tasks;

import java.util.Scanner;

public class Class4Task1 {

	public static void main(String[] args) {

		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less than 200,000 then you would lend the money
		 * otherwise you would reject the client
		 */

		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter amount of the loan");
		int loan = scanner.nextInt();

		if (loan < 200000) {
			System.out.println(loan + " is less than we want please go to different bank");
		}

	}
}