package com.class14;
public class LargestMinumumSecondLargest {
public static void main (String [] args) {	
	
	int [] arr= {144, 46, 0, 86, 999, -1};
	
	int min =0;
	int secondLargest=0;
	int largest=0;
	
	for (int a:arr ) {
		if (a>largest) {
			largest=a;
		}
		if (a<min) {
			min=a;
		}
	}
	for (int a:arr) {
		if (a>secondLargest && a<largest) {
			secondLargest=a;
		}
	}
	System.out.println("Largest number is = "+largest);
	System.out.println("Second largest number is = "+secondLargest);
	System.out.println("Minumum number is = "+min);
}
}
