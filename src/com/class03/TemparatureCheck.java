package com.class03;

public class TemparatureCheck {

	public static void main(String[] args) {
		
		int storeTemperature=45;
		
		if(storeTemperature<32) {
			System.out.println("Water will freeze wtih temperature "+storeTemperature +".");
		}else {
			System.out.println("Water will NOT freeze wtih temperature "+storeTemperature +".");
		}

	}

}
