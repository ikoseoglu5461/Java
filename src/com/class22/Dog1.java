package com.class22;

public class Dog1 extends Animal {

	public static void main(String[] args) {
		
		Dog1 dogObject = new Dog1();
		System.out.println("Dog 1 breed is " + dogObject.breed);
		System.out.println("Dog 1 body color is " + dogObject.bodyColor);
		System.out.println("Is dog 1 " + dogObject.papy + " papy");
		
		dogObject.run();
		

		
	}

	public void run() {
		System.out.println("Dog 1 can run");
	}
}


