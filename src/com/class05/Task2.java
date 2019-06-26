package com.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*Write a program that will read inputs of scores(quiz, mid term, and final scores)
		 * and determine the grade based on the following rules;
		 * 
		 * 
		 * # if the average score>=90 ==> grade=A
		 * # if the average score>=70  and <90==> grade=B
		 * # if the average score>=50 and <70 ==> garade=C
		 * # if the average score<50 ==> grade=F
		 * 
		 * NOTE: averageScore=(quiz+mid term+final score)/3
		 *
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quizScore=scan.nextInt();
		System.out.println("Please enter your mid term score");
		int midTermScore=scan.nextInt();
		System.out.println("Please enter your final score");
		int finalScore=scan.nextInt();
		
		double aveScore=((quizScore+midTermScore+finalScore)/3);
		
		if (aveScore>=90) {
			System.out.println("Grade A");
		}else if (aveScore>=70 && aveScore<90) {
			System.out.println("Grade B");
		}else if (aveScore>=50 && aveScore<70){
			System.out.println("Grade C");
		}else {
			System.out.println("Grade F");
		
		}
		}
		}
