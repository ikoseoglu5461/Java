package com.class14;

public class Task4 {

	public static void main(String[] args) {
		// You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		String str="Is it saturday! Is it rainig! Do we have a Java Class today?";
		
		// Method 1
		String strNew=str.replace("?", "!");
		String [] array=strNew.split("!");
		System.out.println("There is "+array.length+ " sentences.");
		
		//Method 2
		String newArray=str.replaceAll("[0-9A-Za-z ]", "");
		System.out.println("There is "+newArray.length()+ " sentences.");
	}

}
