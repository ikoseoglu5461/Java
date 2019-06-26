package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	/*How would handle InputMismatchException? 
	 *Input Mismatch Exception when user enters mismatch value then programmer expected.
	 */
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your income:");
	
	try {
		int number=scan.nextInt();
		System.out.println(number);
	}catch (InputMismatchException e) {
		System.out.println("You entered wrong input, Please provide integer value");
	}
	
	
}
}
