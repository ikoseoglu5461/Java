package com.class09;

import java.util.Scanner;

public class Task2WithFor {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. Whenever user done with
		 * payments tell them "Thank you for shopping!"
		 */

		Scanner scan;
		String item;
		int price, remainPrice=0, payPrice = 0;
		int x = 0;

		scan = new Scanner(System.in);
		System.out.println("Please enter the item you want to buy:");
		item = scan.nextLine();
		System.out.println("Please enter price of item:");
		price = scan.nextInt();

		for (int x1 = payPrice; remainPrice <= price; x1++) {
			System.out.println("Please enter how much you will pay");
			payPrice = scan.nextInt();

			remainPrice = price - payPrice;
			if (remainPrice > 0) {
				System.out.println("You need to pay " + remainPrice + " more");

				price = remainPrice;

			} else if (remainPrice <= 0) {
				System.out.println("Thank you for shopping!");
				break;
			}

		}

	}

}
