package com.class11;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values from an array print
		// capital for each country. (use 2 different loops).

		String[] countries = { "Turkey", "USA", "Germany", "United Kingdom", "Russia" };
		String capital = null;

		for (int i = 0; i <= countries.length-1; i++) {
		
			switch (countries[i]) {
		case "Turkey":
			capital = "Ankara";
			break;
		case "USA":
			capital = "Washington DC";
			break;
		case "Germany":
			capital = "Berlin";
			break;
		case "United Kingdom":
			capital = "London";
			break;
		case "Russia":
			capital = "Moscow";
			break;
		default:
			capital = "Wrong input";
		}
		
			System.out.println(capital);
		}
	}
}
