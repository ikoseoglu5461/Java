package com.class09;

public class Pyramid {

	public static void main(String[] args) {
		/* I want to print pattern
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    
		 */
		
		for (int a=1; a<=4; a++) {
			for (int b=1; b<=a; b++) {
				
				System.out.print("*");
			}
			System.out.println();	
		}
		
	}
	}


