package com.class05;

public class NestedIfPractice {

	public static void main(String[] args) {
		/*check if user has credit card
		 * check what is the balanca if balance is more than 1000-->pay off
		 * else "you are good"
		 */
	
	boolean creditCard=true;
	int balance=1000;
	
	if (creditCard) {
		System.out.println("Let's check the balance");
		if (balance>=1000) {
		System.out.println("Pay off now");
		}else {
			System.out.println("You are safe");
		}
	}else {
	System.out.println("Do you want a credit card?");
	}
	
	}

}
