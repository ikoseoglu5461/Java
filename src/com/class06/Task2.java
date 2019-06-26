package com.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*Ask user to enter their country a nd capture it.
		 * Once values are captured print which language user speaks
		 */
		
		Scanner scan;
		String country;
		String language;
		

		scan = new Scanner(System.in);
		System.out.println("Please enter which country are you from");
		country = scan.nextLine();

		switch (country) {

		case "USA":
			language= "English";
			break;
		case "Afghanistan":
			language = "Afganian";
			break;
		case "Russia":
			language = "Ruusian";
			break;
		case "Italy":
			language = "Italian";
			break;
		case "Turkey":
			language = "Turkish";
			break;
		case "Morocco":
			language = "Arabic";
			break;
		
		default:
			language = "Unknown";
		}
		System.out.println("Your language is " + language);

	}

}
	

