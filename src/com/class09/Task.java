package com.class09;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		/* Write a program that reads a range of integers (start and point),
		 * provided by a user and then from that range prints
		 * the sum of the even and odd integers.
		 * 
		 */
	
		int startNumber, endNumber;
		Scanner scan;
		int sumOdd=0;
		int sumEven=0;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter start number:");
		startNumber=scan.nextInt();
		System.out.println("Please enter end number:");
		endNumber=scan.nextInt();
		
		
		for (int a=startNumber; a<=endNumber; a++ ) {
			
				if (a%2==1) {
					
					sumOdd=sumOdd+a;
				
				}else if (a%2==0){
					sumEven=sumEven+a;
				}
			
		}
		System.out.println("Total of odd numbers:"+sumOdd);
		System.out.println("Total of even numbers:"+sumEven);
		
	}

}
