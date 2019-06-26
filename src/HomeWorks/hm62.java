package HomeWorks;

import java.util.Scanner;

class Main {
	
	/*
	 * Create a program that prompt user with question:  Do you need a loan?
If the result is true then prompt user with question: What is your credit score? Otherwise eligibility = "Unknown"
Based on the score define users eligibility 
if score is below  600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" .   

The output of the program should be: "The eligibility is ____"
	 */
	
	
	
	public static void main(String[] args) {
			
		
			Scanner scan;
			boolean loan;
			int creditScore;
			String eligibility;

			scan = new Scanner(System.in);
			System.out.println("Do you need a loan?");
			loan = scan.nextBoolean();

			if (loan) {
				System.out.println("What is your credit score?");
				creditScore = scan.nextInt();
				
				if (creditScore < 600) {
					eligibility = "Not eligible";
				} else if (creditScore >=600 && creditScore <= 700) {
					eligibility = "Maybe eligible";
				} else if (creditScore >=701 && creditScore <=800) {
					eligibility = "Eligible";
				} else {
					eligibility = "Definitely eligible";
				}
			} else {
				eligibility = "Unknown";
			}
			System.out.println("The eligibility is " + eligibility);
		}
	}