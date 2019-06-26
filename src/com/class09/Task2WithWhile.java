package com.class09;

import java.util.Scanner;

public class Task2WithWhile {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. Whenever user done with
		 * payments tell them "Thank you for shopping!"
		 */

		int price, pay, Total, Left;
		String item;
		int left = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter what you want");
		item = scan.nextLine();
		System.out.println("Please enter the price of item");
		price = scan.nextInt();

		while (true) {

			System.out.println("Please enter price u pay");
			pay = scan.nextInt();

			left = price - pay;

			if (left > 0) {

				System.out.println("You need to pay " + left + " more");

				price = left;

			} else if (left <= 0) {
				System.out.println("Thank you for shipping with us!");
				break;
			}
		}
	}

}