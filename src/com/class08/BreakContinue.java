package com.class08;

public class BreakContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<10; i++) {
			
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		for (int g=1; g<=5; g++) {
			System.out.println("Hello");
			break;  // only one time break means stop there
		}
		
	}

}
