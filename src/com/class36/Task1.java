package com.class36;

public class Task1 {

	public static void main(String[] args) {
		// create an exception: when user it trying to withdraw larger amount than the balance
		//throw an exception saying "You do not have enough money"

		
		checkWithDrawBalanceEligibility(400, 350);
	}
	public static void checkWithDrawBalanceEligibility(int money, int balance) {
		if (money<=balance) {
			System.out.println("Have a good day");
		}else {
			throw new ArithmeticException("You do not have enough money");
		}
}
}
