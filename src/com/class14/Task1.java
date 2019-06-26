package com.class14;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		String motherName, fatherName, babyName, gender;
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		
		if (gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+
					motherName.substring(motherName.length()/2);
		}else if (gender.equalsIgnoreCase("girl")) {
			babyName=motherName.substring(0, motherName.length()/2)+
					fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
		}
		System.out.println(babyName.toUpperCase());
	}

}
