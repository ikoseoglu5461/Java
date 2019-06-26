package repls;

public class Car {



	Car (){}
	  static int numberOfDoors;
	  
	  
	  Car(String make, String model, int numberOfDoors, int topSpeed, double price){
		System.out.println(make+ " " + model + " " +numberOfDoors+" "+topSpeed+" "+price);
		}
		Car(String make, String model, int topSpeed, double price){
		System.out.println(make+ " " + model + " " +numberOfDoors+" "+topSpeed+" "+price);
		}
		Car(int numberOfDoors, int topSpeed, double price){
		System.out.println(numberOfDoors+" "+topSpeed+" "+price);
	 }
	 Car(String make, String model, int numberOfDoors){
		System.out.println(make+ " " + model + " " +numberOfDoors);
	}
	}