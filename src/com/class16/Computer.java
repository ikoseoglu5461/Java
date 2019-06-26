package com.class16;

public class Computer {

	String model, screen, os;
	int ram, storage;
	boolean mouse, keyboard;
	
	public static void main (String [] args) {
		
		// ClassName variableName=new CalassName(); 
		//1. Object
		Computer com1=new Computer();
		com1.model="Lenova";
		com1.screen="NVDIA";
		com1.os="Microsoft";
		com1.ram=16;
		com1.storage=512;
		com1.keyboard=true;
		com1.mouse=false;
		
		// 2. Object
		
		Car car2=new Car();
		com1.model="Apple";
		com1.screen="NVDIA";
		com1.os="Mac";
		com1.ram=8;
		com1.storage=256;
		com1.keyboard=true;
		com1.mouse=false;
	}
}