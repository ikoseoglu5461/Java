package com.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// post increment
		// a++;           a--;
	
		int a=299;
		int b=a++; // first assign--->increment (int b=a; a=a+1)
		
		
		System.out.println(a); //300
		System.out.println(b); //299
		
		//post decrement x--;
		
		int x=10;
		int y=x;
		
		System.out.println(x + " " + y);
	
		int z=10;
		int c=z--;
		
		System.out.println(z); // 9
		System.out.println(c); // 10
	
	}

}
