package com.class07;

public class Loops {

	public static void main(String[] args) {
		//to eliminate repetition we use lopps
		
		System.out.println("Good Morning");
		System.out.println("Good Morning");
		System.out.println("Good Morning");
		System.out.println("Good Morning");
		System.out.println("Good Morning");
		
		
		/* Loops in Java
		 * while
		 * do while
		 * for
		 * enhanced for loop( for each loop)//collections or arrays
		 */
		
		boolean morning=true;
		if (morning) {
			System.out.println("Good Morning"); // print only once
		}
		boolean morning1=true;
		while (morning1) {
			System.out.println("Good Morning"); //infinite times 
		}
		int a=1;
		while (a<10) {
			System.out.println("Good Morning");
			a++; 
			
		}
		
	}

}
