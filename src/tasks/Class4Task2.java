package tasks;

import java.util.Scanner;
public class Class4Task2 {

	public static void main(String[] args) {
		/*
		 * You are DMV reprensentive and you need to ask customer their age.\
		 * If they are 18 and older you will issue a driver licence to them,
		 * Otherwise you will offer them to get a learners permit.
		 */
		
		int age;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age");
		
		age=input.nextInt();
		
		if (age>=18) {
			
		System.out.println("You can apply to deriver licence program");
		
		}else {
			System.out.println("You need to get permit.SORRY");
		}
		
	}

}
