package com.class18;

import com.class17.Calculator;

public class ApplicationForCalculator {

	public static void main(String[] args) {

		Calculator call = new Calculator();

		System.out.println(call.sum(5, 10));
		System.out.println(call.sub(20, 10));
		System.out.println(call.mult(5, 10));
		System.out.println(call.div(100, 10));
		ApplicationForCalculator app = new ApplicationForCalculator();
		long result = app.example6('a');
		System.out.println(result);
	}

	void example() {

	        System.out.println("No return value and NO Parameters");
	    }

	void example2(String name) {

	        System.out.println("No return value but with Parameter : "+ name);
	    }

	boolean example3() {

	        System.out.println("With return value and NO Parameters");
	        return true;
	    }

	String example4(String name) {

	        System.out.println("No return value but with Parameter : "+ name);
	        
	        return name;
	    }

	boolean example5(String name) {

	        System.out.println("No return value but with Parameter : "+ name);
	        
	        return false;
	    }

	long example6(char name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return name;
	    }
}
