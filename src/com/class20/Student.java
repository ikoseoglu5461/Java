package com.class20;

public class Student {

	public static void main(String[] args) {
		
		
		Student result = new Student();
		
		System.out.println("My grade at Syntax is "+result.getGrade(95));
	}

	char getGrade(int score) {
		char grade;
		if (score>90) {
			grade= 'A';
		}else if (score>=80 && score<90) {
			grade=  'B';
		}else if (score>=70 && score<80) {
			grade= 'C';
		}else if (score>=60 && score<70) {
			grade= 'D';
		}else if (score>=50 && score<60) {
			grade= 'C';
		}else {
			grade= 'F';
		}
		return grade;
	}
}
