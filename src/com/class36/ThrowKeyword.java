package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		//System.out.println(a/b); //new ArithmeticException
		
		//if person is >18 -->issue dr licence else -->throw an exception
		
		//checkAgeEligibility(17);
		//twoNumDiv(10, 0);
		checkUserNameLenght("Al" );
		
	}

	public static void checkAgeEligibility(int age) {
		if (age>=18) {
			System.out.println("Congratilations on your driver licence");
		}else {
			throw new ArithmeticException("You not eligible to get driver licence");
		}
	}
	public static void twoNumDiv(int a, int b) {
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("We can not divide by zero");
		}
	}
	public static void checkUserNameLenght(String userName ) {
		if(userName.length()>3) {
			System.out.println("Username is accepted");
		}else {
			throw new NullPointerException ("Username must be longer than 3 characters");
		}
	}
	
}
