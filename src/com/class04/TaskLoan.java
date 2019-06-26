package com.class04;

import java.util.Scanner;

public class TaskLoan {

	public static void main(String[] args) {
		
		Scanner Myscanner=new Scanner (System.in);
		System.out.println("What is the amount you need :");
		int amount=Myscanner.nextInt();
		
		if (amount<200000) {
			System.out.println("Ok you can get a loan");
		}else {
			System.out.println("Sorry you can NOT have a loan");
		}
	}

}
