package com.class04;

import java.util.Scanner;

public class TaskCityAndTemperature {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner (System.in);
		System.out.println("Please enter your city:");
		String cityName=scanner.nextLine();
		System.out.println("Please enter your city temperature(F):");
		int cityTemperature=scanner.nextInt();
		
		//(F-32)x5/9;
		int ConvertedTemp=(cityTemperature-32)*5/9;
		
		System.out.println("The temperature is the city "+cityName +" is " +ConvertedTemp);

	}

}
