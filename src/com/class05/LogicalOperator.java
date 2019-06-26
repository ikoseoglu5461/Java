package com.class05;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user enter daily sales amount based on the sales range
		 * commission will be differenr; Example: sales is <100 ===> commission=2 sales
		 * more than 100 and less than 200=5
		 */

		Scanner scan;
		int sales;
		int commission;
		scan = new Scanner(System.in);
		System.out.println("Please enter sales amount");
		sales = scan.nextInt();

		if (sales > 0 && sales < 100) {
			System.out.println("Commissin is 2");
		} else if (sales > 100 && sales < 200) {
			System.out.println("Commission is 5");
		} else if (sales >= 200 && sales < 500) {
			System.out.println("Commission is 10");
		} else if (sales > 500) {
			System.out.println("Commission is 20");
		} else {
			System.out.println("Commission is 0");
		}
	}
}
