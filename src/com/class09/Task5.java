package com.class09;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number between 1
		 * and 20. After every guess input, the program tells the user whether their
		 * number was too large or too small. The program will keep asking the user to
		 * enter the number until he finds the correct number. When the correct answer
		 * is found the system should display "Congratulations!!. You got it!".
		 */

		Scanner scan;
		int guessNumber=0;
		int secretNumber = 13;

		scan = new Scanner(System.in);
		
		for (int x = guessNumber; x <= secretNumber; x++) {
		
		System.out.println("Please enter your guess number between 1-20");
		guessNumber = scan.nextInt();

		

			if (guessNumber > secretNumber) {
				System.out.println(guessNumber + " was too large.");

			} else if (guessNumber < secretNumber) {
				System.out.println(guessNumber + " was too small.");

			} else if (guessNumber == secretNumber) {
				System.out.println("Congratulations!!. You got it!");
				break;

			}

		}

	}

}
