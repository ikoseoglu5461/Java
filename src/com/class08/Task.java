package com.class08;

public class Task {

	public static void main(String[] args) {
		/*
		 * 1. print numbers from 1 to 100 
		 * 2.print numbers from 100 to 1 
		 * 3. Print odd numbers from 1 to 20 ( 2 ways) 
		 * 4. Print even numbers from 20 to 1 ( 2 ways)
		 * 5. Print even number between 20 to 50 ( 2 ways) 
		 * 6. Print odd numbers between 20 to 50 ( 2 ways)
		 */
//1
		for (int a = 1; a <= 100; a++) {
			System.out.print(" " + a);
		}
//2		
		

		for (int b = 100; b >= 1; b--) {
			System.out.print(" " + b);
		}
//3		
		

		for (int c = 1; c <= 20; c+= 2) {
			System.out.print(" " + c);
		}
//4 
	

		for (int d = 20; d >= 1; d+= 1) {
			System.out.print(" " + d);
		}
//5.1way
		
		
		for (int e=20; e<=50; e++) {
			
			if (e%2==0) {
			System.out.print(" "+e);}
		
//5.2way		
		
			for (int z=20; z<=50; z+=2) {
				System.out.print(" "+z);}
//6
	
		
		for (int f=20; f<=50; f++) {
			if (f%2==1) {
			System.out.print(" "+f);
		}
			}

		}
	}
}
