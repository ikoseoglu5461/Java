package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a=19;
		int b=5;
		
		boolean result=a>b;
		boolean result1=a==b;
		
		System.out.println(result);
		System.out.println(result1);
		
		//compare 2 numbers and if a is larger than b---> print
		
		if (a>b) {
			
		System.out.println("a is larger than b");
		}
		else {
		System.out.println("b is larger than a");
		}
		
		
		//declare price and if orice is higher than expected price--> I will not buy shoes
		double shoesPrice=29.99;
		double allowedPrice=31.99;
		
		if(shoesPrice<=allowedPrice) {
		System.out.println("I am buying those shoes");}
		else {
		System.out.println("I am NOT buying those shoes");
		}
		
		System.out.println("I am continues code");
		
	}

}
