package com.class07;

public class Task1 {

	public static void main(String[] args) {
		/* 1. Declare variable and increase by 100 using shorthand operator
         * 2. Declare variable and decrease by 67 using shorthand operator
         * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
         * each person should get an equal piece of cake
         * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
         * using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
         */
		
		//1
		int a=10;
		a+=100; //110
		
		System.out.println(a);
		
		//2
		int b=3;
		b+=67;
		
		System.out.println(b);
		
		//3
		int cakePiece1=11;
		
		cakePiece1/=4;
		System.out.println("Every person got " +cakePiece1);
		//4
		
		int cakePiece2=25;
		cakePiece2/=7;
		System.out.println("Every person got "+cakePiece2);
		
		int cakePiece3=25;
		cakePiece3%=7;
		System.out.println("The left over is " +cakePiece3);
	}

}
