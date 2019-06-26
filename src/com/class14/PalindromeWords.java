package com.class14;

import java.util.Scanner;

public class PalindromeWords {

	public static void main(String[] args) {
		//	//6. Write a Java Program to find whether a String is palindrome or not?
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a word:");
		String word=scan.nextLine();
		
		String reverse="";
		
		for (int i=word.length()-1; i>=0; i--) {
			reverse=reverse+word.charAt(i);
			
		}
		
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palidrome ");
		}else {
			System.out.println("The word is not palidrome ");
		}
		
	}

}
