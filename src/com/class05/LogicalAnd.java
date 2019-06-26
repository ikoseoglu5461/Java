package com.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		/* Ask user to enter age and based on the age we will print;
		 * if age is older than 1 but less than 3--> baby
		 * if age is older than 3 but less than 5--> toddler
		 * if age is older than 5 but less than 13--> kid
		 * if age is older than 13 but less than 20--> teenager
		 * if age is older than 20 but less than 64--> adult
		 * if age is older or equal to 64 --> senior
		 * 
		 */

		Scanner myScanner;
		int age;
		
		myScanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=myScanner.nextInt();
		
		
	        if(age < 1) {
	            System.out.println("Invalid value");
	        } else if(age >= 1 && age < 3) {
	            System.out.println("You are a Baby");
	        }else if(age >= 3 && age < 5) {
	            System.out.println("You are a Toddler");
	        }else if(age >= 5 && age < 13) {
	            System.out.println("You are a Kid");
	        }else if(age >= 13 && age < 20) {
	            System.out.println("You are a Teenager");
	        }else if(age >= 20 && age < 64) {
	            System.out.println("You are a Adult");
	        }else {
	            System.out.println("You are a Senior");
	        }   
	    }
	}