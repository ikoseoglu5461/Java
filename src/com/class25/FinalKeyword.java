package com.class25;

public final class FinalKeyword {
	
	public static final String name="SYNTAX";

	public static void main(String[] args) {
		/*Final keyword can be used in 3 places/ways
		 * 1.variable
		 * 2.methods
		 * 3.classes
		 * 
		 */
		
	public final void hello() {
		System.out.println("Hello from Parent class");
	}

	}
	class ChildOfFinal extends FinalKeyword {
		// CANNOT OVERRIDE FINAL METHOD
		// public void hello(){
		//System.out.println("Hello from Parent class");
		
	}

}
