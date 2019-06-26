package com.class26;

public class ThisWithConstructor {
	
	ThisWithConstructor() {
		System.out.println("I am inside constructor with no parameters");
		System.out.println("I have no paramaters");
	}
	ThisWithConstructor(String str){
		System.out.println("I have 1 string parameter "+str);
	}
	ThisWithConstructor(String str1, String str2){
		this(str1); //Means only one string parameters
		System.out.println("I am inside constructor with 1 parameter");
		System.out.println("I have 2 string parameter "+str1+" and "+str2);
	}
	
	public static void main (String [] args) {
		ThisWithConstructor obj1=new ThisWithConstructor();
		ThisWithConstructor obj2=new ThisWithConstructor("Hello");
		
		ThisWithConstructor obj3=new ThisWithConstructor("Hello", "Bye");
		
		/* 1.I am inside constructor with no parameters
		 * 2.I have no paramaters
		 * 3.I have 1 string parameter Hello
		 * 4.I have 1 string parameter Hello
		 * 5.I am inside constructor with 1 parameter
		 * 6.I have 2 string parameter Hello and Bye
		 */
	}

}
