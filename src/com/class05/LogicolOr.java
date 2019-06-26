package com.class05;

import java.util.Scanner;

public class LogicolOr {

	public static void main(String[] args) {
		/* we have 7 days a week
		 * if days are from 1-5-->weekdays
		 * if days are from 6-7-->weekend
		 * otherwise "Not a valid day"
		 */
		
		
		// fasle OR false OR false OR false OR true--->True
		
		Scanner inp=new Scanner(System.in);
		System.out.println("What is the day today");
		String day=inp.nextLine();
		
		if  (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday") ){
			 System.out.println("Weekdays");
	
		}else if (day=="saturday" || day=="sunday") {
			System.out.println("Weekend");
		}else {
			System.out.println("Not valid");
		}
	}
	}


