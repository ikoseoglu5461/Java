package com.class14;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// 7. Write a java program to check whether a given number is prime or not?
		// (Asal sayi)
		// PrimeNumber should meet 2 conditions: divisible by 1& by itself only
		// 2,3,5,7,9,11,13,17,19,23,29

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number to check it is prime or not:");
		int number = scan.nextInt();

		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i != 0) {

			} else {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
	}
}