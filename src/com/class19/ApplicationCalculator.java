package com.class19;

public class ApplicationCalculator {

	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		
		System.out.println("Sum of the numbers: "+calc.sum(12, 13, 14));
		System.out.println("Avarage of the numbers: "+calc.avarage(12, 13, 14));
		System.out.println("Minimum of the numbers: "+calc.min(12, 13, 14));
		System.out.println("Maximum of the numbers: "+calc.max(12, 13, 14));
	}

}
