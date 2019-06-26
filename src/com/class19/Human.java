package com.class19;

public class Human {
	
	public static int number = 0;
	public static String eyeColour = "Brown"; // static mean does`n matter after this point eye colour only brown.
	int height;// = 6;
	int weight;// = 180;
	String gender;// = "F";

	String programmingLanguage = "Java";

	void speak() {

		String language = "English";

		System.out.println("Humans can speak" + language);

	}

	void coding() {

		System.out.println("Syntax students can code" + programmingLanguage);

	}
	void print () {
		System.out.println(eyeColour);
	}
	public static void main (String [] args) {
		
		Human person=new Human();
		String eyeColour = "Brown"; // static mean does`n matter after this point eye colour only brown.
		int height = 6;
		int weight = 180;
		String gender = "F";
		
		Human person1 = new Human();
		
		//person.eyeColour="Blue";
		
		System.out.println(Human.eyeColour + " " + Human.eyeColour);
		
		for(int i = number; i < 10; i++) {
			System.out.println(i);
			number++;
			
		}
		System.out.println("--------------------");
		for(int i = number; i < number+10; i++) {
			System.out.println(i);
			
		}
		
//		System.out.println(person.height);
//		System.out.println(person.weight);
//		System.out.println(person.gender);
	}
}
