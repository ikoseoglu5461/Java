package com.class36;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		//2 way to create String
		
		//1. way -using String literal
		String str="Hello";
		
		//2. way
		String str2=new String("Bye");
		
		
		str=str.toUpperCase();
		str=str.replace("o", "a");
		System.out.println(str);
		
		
		
	
	}

}
