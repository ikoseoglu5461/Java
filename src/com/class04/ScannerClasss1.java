package com.class04;

import java.util.Scanner;

public class ScannerClasss1 {
 
	
	public static void main(String[] args) {
	//ask user for the number print Good Mornin__
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please ente your name");
		
		String name=input.nextLine();
		
		System.out.println("Good Morning "+name);
		
		
}
}
