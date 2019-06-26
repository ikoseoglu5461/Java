package com.class09;

public class Examples {

	public static void main(String[] args) {
		/*
		 *        
		 *        *
		 *        **
		 *        ***
		 *        ****
		 */
		
		int rows=4;
		for (int a=1; a<=rows; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		
	}

}
