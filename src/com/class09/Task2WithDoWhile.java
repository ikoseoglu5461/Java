package com.class09;

import java.util.Scanner;

public class Task2WithDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double totalPayment = 0;
		double payment, price, balance;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your item");
		String item = scan.nextLine();
		System.out.println("Please enter the item price");
		price = scan.nextDouble();

		do {

			System.out.println("Please enter your payment amount");

			payment = scan.nextDouble();

			totalPayment = totalPayment + payment;

			balance = price - totalPayment;

			System.out.println("$" + balance + " is left to pay off the amount");

		} while (totalPayment != price);
		System.out.println("Thank you for shopping with us!");

	}

}
