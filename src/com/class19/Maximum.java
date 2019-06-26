package com.class19;

public class Maximum {

	

		static int maxOfValues(int [] array) {

		int max = array[0];
		int min = array[0];

		for (int j = 0; j < array.length; j++) {
			if (array[j] >= max) {
				max = array[j];

			}
			if (array[j] <= min) {
				min = array[j];
				
				return max;
				
			}
			
		}
		System.out.println(maxOfValues(array));
		return max;
	}
}
