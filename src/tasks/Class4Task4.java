package tasks;

import java.util.Scanner;

public class Class4Task4 {
	public static void main(String[] args) {

		/*
		 * Create a java program and store veriables to store mortgage rate and mortgage
		 * price. First program should check if rate is higher than 4.5 user will not
		 * buy a house. otherwise user will consider buying.Once user decides to buy a
		 * house, if price of the house is larger than 200000 than user will take a
		 * loan, otherwise user will pay cash.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type your mortgagerate");

		double mortgagerate = scanner.nextInt();
		System.out.println("Please enter house price");
		double houseprice = scanner.nextInt();

		if (mortgagerate > 4.5) {

			System.out.println("You will not buy a house");
		} else {
			System.out.println("Your decides to buy a house");
			if (houseprice > 20000) {
				System.out.println("You need to get a loan");
			} else {
				System.out.println("You will pay a cash");
			}
		}

	}
}
