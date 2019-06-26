package com.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*Allow user to enter grade and than provide expalanation;
		 * A-Excellent, B-Good, C-Average , D-Bad
		 * any other grade--->Not Acceptable.
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner scan;
		String grade;
		String explanation;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your grade");
		grade=scan.nextLine();
		System.out.println("A-Excellent, B-Good, C-Average, D-Bad, Other-Not Accetable");
		
		switch(grade) {
		
		case "A":
			explanation= "Excellent";
			break;
		case "B":
			explanation= "Good";
			break;
		case "C":
			explanation= "Average";
			break;
		case "D":
			explanation= "Bad";
			break;
		default:
			explanation = "Not Acceptable";
			
		}
		System.out.println("Your grade means is " +explanation);
	}
	}
			