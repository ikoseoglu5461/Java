package com.class09;

public class Task4 {

	public static void main(String[] args) {
		/*
		  4. Print the following pattern: rows=x, colm=y
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		        */

		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int x = 5; x > 0; x--) {
			for (int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
