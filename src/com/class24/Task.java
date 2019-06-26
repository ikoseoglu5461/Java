package com.class24;

public class Task {
	
	static void all () {
		System.out.println("My name is");
	}
	static void all(String str) {
		System.out.println("My name is "+str);
	}
	static void all (String str, int a) {
		System.out.println("My name is " +str+ " "+a+" years old");
	}

	public static void main(String[] args) {
		/*Create 1 class with a static method that has 3 overloaded forms. 
		 * Then call each overloaded method with specific arguments and observe result.
		 */
		Task.all();
		Task.all("Ismail");
		Task.all("Ismail", 30);

	}

}
