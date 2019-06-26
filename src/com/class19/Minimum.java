package com.class19;

public class Minimum {
	
	// numbers is in the class call ApplicationForAnimal
	
		
		static int minOfValues(int [] x) {
		
		int min=Integer.MAX_VALUE;
		
		for (int y: x) {
			if (y<min) {
				min=y;
			}
		}
		
		return min;
	
	}

		
}
