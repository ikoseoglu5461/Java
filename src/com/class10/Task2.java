package com.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 */
		
		String[] names= {"Ismail", "Hakan", "Mehmet", "Ibrahim", "Fatih"};
		
		System.out.println(names[0]);
		
		
		String[] name=new String[5];
		
		name[0]="Ismail";
		name[1]="Hakan";
		name[2]="Mehmet";
		name[3]="Ibrahim";
		name[4]="Fatih";
		
		
		System.out.println(name [0]);
		
		
		
	}

}
