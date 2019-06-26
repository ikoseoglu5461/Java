package com.class09;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Print the following pattern:
			1
			12
			123
			1234
			12345
		 */
	
	
	for (int x=1; x<=5; x++) {
		
		for (int y=1; y<=x; y++) {
			
			System.out.print(y);
		}
		System.out.println("");
	}
	}
}