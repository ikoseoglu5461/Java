package com.class23;

public class ConstructorOverloading {
	
	ConstructorOverloading() {
		System.out.println("I am a contructor with no parameters");
	
	}
	ConstructorOverloading(String str) {
		System.out.println("I am a contructor with 1 String parameters");	
	}
	ConstructorOverloading(String str, String str2) {
		System.out.println("I am a contructor with 2 String parameters");	
	}
	ConstructorOverloading(int a) {
		System.out.println("I am a contructor with 1 integer parameters");	
	}
	
}
