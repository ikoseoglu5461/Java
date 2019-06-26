package com.class31;

import java.util.ArrayList;

public class CarList {

	public static void main(String[] args) {
		/*Create an arraylist of cars and retrieve all the values using 4 different ways.
		 * 
		 */

		ArrayList<String> car=new ArrayList<String>();
		
		car.add("Toyota");
		car.add("Honda");
		car.add("Mercedes");
		car.add("BMW");
		car.add("Ford");
		
		System.out.println("----1.Way----");
		
		System.out.println(car);
		
		System.out.println("----2.Way----");
		
		System.out.println(car.get(0));
		System.out.println(car.get(1));
		System.out.println(car.get(2));
		System.out.println(car.get(3));
		System.out.println(car.get(4));
		
		System.out.println("----3.Way----");
		
		for (int i=0; i<car.size(); i++) {
			System.out.println(car.get(i)+" ");
		}
		System.out.println("----4.Way----");
		
		for (String cars:car) {
			System.out.println(cars);
		}
		
	}

}
