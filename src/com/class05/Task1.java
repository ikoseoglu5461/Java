package com.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*Prompt user to enter person heights in inches.
		 * person should be classified one of the following:
		 * # short(under 5 feet)
		 * # medium (5 to 6 feet)
		 * # tall (6 feet and over)
		 */
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter your height");
	int height=scan.nextInt();
	//12 feet 1 inches
	
	int con=height/12;
	
	if (con<5) {
		System.out.println(con + " You are short");
		
	}else if (con>=5 && con<6) {
		System.out.println("Your are medium");
	}else if (con>=6) {
		System.out.println("You are tall");
	}
	}
}
