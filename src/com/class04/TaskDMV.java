package com.class04;

import java.util.Scanner;

public class TaskDMV {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner (System.in);
		System.out.println("How old are you:");
		int age=scanner.nextInt();
		
		if(age>=18) {
			System.out.println("You can apply driver licence");
		}else {
			System.out.println("You can apply permit driver licence");
		}
	}

}
