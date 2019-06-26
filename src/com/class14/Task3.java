package com.class14;

public class Task3 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String str="Tell me something 12345 @#$%&";
				
		String newArray=str.replaceAll("[0-9A-Za-z ]", "");
		System.out.println("The length of the new array is "+newArray.length());
		
		}

	}


