package com.class13;

import java.util.Scanner;

public class StringRewievTask1 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).
		
		Scanner scan=new Scanner (System.in);
		System.out.println("In:");
		String word=scan.nextLine();
		
		for (int i=word.length()-1; i>=0; i--)
			System.out.print(word.charAt(i));
		
	}

}
