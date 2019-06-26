package com.class14;

public class Task2 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		
		String str="My name is Ismail Koseoglu";
		String [] array=str.split(" ");
		
		for (String substring:array) {
			System.out.print(substring);
		}
		
	}

}
