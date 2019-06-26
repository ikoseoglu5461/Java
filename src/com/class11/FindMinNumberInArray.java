package com.class11;

public class FindMinNumberInArray {

	public static void main(String[] args) {
		
		
		int [] numbers= {10,20,30,40,5,6,7,8,9,10};
		
		int min=numbers[0];
		
		for (int i=0; i<numbers.length; i++) {
			
			if (numbers[i]<min) {
				min=numbers[i];
			}
		}
		
		System.out.println(min);
		
	}

}
