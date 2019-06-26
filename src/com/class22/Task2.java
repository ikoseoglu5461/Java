package com.class22;

public class Task2 {

	/*
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade.
	 * 
	 * Test Student class for 5 different students with different marks. Your
	 * program should print an average mark of each students name. NOTE: please male
	 * different names for instance and local variables.
	 * 
	 */
	public static String schoolName = "The World School";

	public String studentGender;
	public int mathematic;
	public int chemistry;
	public int biology;
	public String studentName;

	public Task2(String name, int math, int chem, int bio) {
		studentName = name;
		mathematic = math;
		chemistry = chem;
		biology = bio;
	}

	public void getStudentAvarage() {
		
		int average=(mathematic+chemistry+biology)/3;
		
		String info= "My name is " + studentName + " I am a student at " + schoolName + " my mathematic grade is "
				+ mathematic + " my chemistry grade is " + chemistry + " my biology grade is " + biology+" my avarege is "+average;
		
		
		System.out.println(info);
		
	}
}
