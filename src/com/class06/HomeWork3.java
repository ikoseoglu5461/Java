package com.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculater. Allow user to enter 2 numbers and
		 * operator(+,-,*,/) Based on operator provide the result the user
		 */

		double num1, num2;
		double result;
		String operation;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		num1 = scan.nextDouble();
		System.out.println("Please enter second number");
		num2 = scan.nextDouble();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter your operation");
		operation = scan1.nextLine();
		

		switch (operation) {
		
		case "+":
			result = num1 + num2;
			break;

		case "-":
			result = num1 - num2;
			break;

		case "/":
			result = num1 / num2;
			break;

		case "*":
			result = num1 * num2;
			break;	
		
		default:
			result = 0;
		}
		System.out.println("Your result is " + result);
		
	}
	}


