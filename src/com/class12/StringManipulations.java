package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str="Syntax";
		int lengthOfString=str.length();
		System.out.println(lengthOfString);
		
		String str1="Syntax Technologies";
		int lengthOf2String=str1.length();
		System.out.println(lengthOf2String);
		
		String str2="Welcome Students!";
		int lengthOf3String=str2.length();
		System.out.println(lengthOf3String);
		
		//
		
		String str3="Hello";
		String newString= str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		// equals() - compare 2 string, if string are equal---> true, else--->false
		String str4="Hello";
		String str5="Hello";
		
		boolean equality=str4.equals(str5);
		System.out.println(equality);
		
		//equalsIgnoreCase() - compares 2 string but ignores case
		
		String expectedBrowser="Chrome";
		String actualBrowser="CHROME";
		
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
	}

}
