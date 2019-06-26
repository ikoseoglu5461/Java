package com.class17;

public class Task3 {

	public static void main(String[] args) {
		// Create a method that will print whether given String is palindrome or not.

		Task3 str = new Task3();
		
		str.palindrome("Hannah");
		str.palindrome("Bob");
		str.palindrome("John");

	}void palindrome(String str){
		
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--) {
		 
			reverse=reverse+str.charAt(i);
	}
		if(reverse.equalsIgnoreCase(str)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
		
	}
}