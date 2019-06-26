package com.class19;

public class ApplicationForAnimal {

	public static void main(String[] args) {
		
		Animal dog=new Animal ();
		
		
		System.out.println("Dog breed is "+Animal.breed);
		System.out.println("Dog name is "+ dog.name);
		System.out.println("Dog weight is "+dog.weight);
		System.out.println("Dog age is "+dog.age);
 
		Animal dog1=new Animal ();
		
		dog1.name="Joe";
		dog1.age=5;
		
		System.out.println("Dog 1 breed is "+Animal.breed);
		System.out.println("Dog 1 name is "+dog1.name);
		System.out.println("Dog 1 weight is "+dog1.weight);
		System.out.println("Dog 1 age is "+dog1.age);
		
		System.out.println(dog.isWild());
		System.out.println(dog.canBark());
		
		int my_array[] = { -10, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		
		System.out.println("Printing the minumum value");
		
		System.out.println(Minimum.minOfValues(my_array));
		System.out.println(Minimum.minOfValues(array));
		
		Minimum min=new Minimum();
		System.out.println(min.minOfValues(array));
	}

	
	}


