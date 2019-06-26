package com.class26;

public class ThisKeyword {
	
	int num1, num2;
	
	public ThisKeyword() {//Default constructor
		System.out.println("No parameter");
	}
	
	public ThisKeyword (int num1, int num2) {//constructor
		this.num1=num1;
		this.num2=num2;
		
	}

public void sum(int num1, int num2) {
	System.out.println("The sum of local variablas= "+(num1+num2)); 
	System.out.println("The sum of instance variables= "+(this.num1+this.num2));
}
}
