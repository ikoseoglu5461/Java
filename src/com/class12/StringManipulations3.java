package com.class12;

public class StringManipulations3 {

	public static void main(String[] args) {
		
		//charAt() --> returns a character at specified index
		
		String str="Students";
				
		//char character=str.charAt(7);
		//System.out.println(character);
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+",");
		}
		
		//indexOf() returns an index of specified character
		
		System.out.println("_______indexOf()_______");
		
		String str1="Sunday";
		int index=str1.indexOf("d");
		System.out.println(index);
		
		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax")); //0
		System.out.println(str2.indexOf("Technologies")); //7
		System.out.println(str2.indexOf(" ")); //6
		System.out.println(str2.indexOf("w")); //-1
		
		//
		System.out.println("--------------Substring--------------");
		
		String str3="Today is Sunday Java class";
		String newString=str3.substring(15);
		System.out.println(newString);
		
		System.out.println(str3.substring(0, 5));  // today
		System.out.println(str3.substring(9, 20));  // Sunday Java
		System.out.println(str3.substring(16, 20)); // Java
		System.out.println(str3.substring(21)); //class
	}

}
