package com.class09;

import java.util.Scanner;

public class Task5DoWhile {

	public static void main(String[] args) {
		
		
		Scanner scan;
		int guessNumber, secretNumber=11;
		
		scan=new Scanner (System.in);
		
		do {
		
		System.out.println("Please enter your guess number between 1-20");
		guessNumber=scan.nextInt();
		
		if (guessNumber>secretNumber) {
			System.out.println(guessNumber +" was too large.");
		}else if (guessNumber<secretNumber){
			System.out.println(guessNumber +" was too small.");
		}
		
		}while (secretNumber!=guessNumber); 
			System.out.println("Congratulations!!. You got it!");
		}
		

	}

