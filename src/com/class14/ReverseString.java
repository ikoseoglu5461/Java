package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string without using a reverse function
		
		String original="Today is Java Class";
		String reverse="";
		
		char [] array=original.toCharArray();
		
		for (int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i]; //""+"s"
			System.out.println("Reversed String is: "+reverse);
			
			// 2 charAt()
			
			
			String reverse1="";
			
			for (int i1=original.length()-1; i1>=0; i1--) {
				
				reverse1=reverse1+original.charAt(i1);
				
			}
			System.out.println("Reversed String is: "+reverse1);
			
			// 3 using Substring()
			
			String reverse2="";
			for (int i2=original.length()-1; i2>0; i2--) {
				
				reverse2=reverse2+original.substring(i2-1, i2);
			}
			System.out.println("Reversed String is: "+reverse2);
		}
		

	}

}
