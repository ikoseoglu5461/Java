package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*write a program that prints out if it is good weather to go for any activity or not
		 * 
		 * if the temperature is between 40 degrees and 80 degrees inclusive & no rain--->we will go hiking
		 * otherwise--> we will not go hiking
		 * if temperature is between 25 and 40 inclusive & snowing--->going snowboarding otherwise
		 * we are not going to snowboarding 
		 * it if temperature is more than 80 & sunny ---> go to the beach
		 * otherwise---> not go to the beach
		 */
		
		int temperature;
		boolean rain=false;
		boolean snow=true;
		boolean sunny=true;
		String activity;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temp=scan.nextInt();
		
		
		if  (temp>=40 && temp<80){
			System.out.println("Is it snowing?");
			rain=scan.nextBoolean();
			
			if (rain) {
				activity="I will go hiking";
			}else {
				activity="I will not go hiking";
			}}
			else if(temp>=25 && temp<40) {
				System.out.println("Is it raining");
				rain=scan.nextBoolean();
				if (rain) {
					activity="watch the movie";
			}else {
				activity="Go hiking";
				}}
			
			else if(temp>=25 && temp<40) {
				System.out.println("Is it snowing");
				snow=scan.nextBoolean();
				if (snow) {
					activity="Snowboarding";
			}else {
				activity="Let's code";
			}
			}
			else if (temp>=80) {
				System.out.println("Is it sunny");
				sunny=scan.nextBoolean();
				
				if (sunny)
					{activity="Go to the beach";
			}else {
				activity="Do more coding";}
				
			}else{
				activity="Stay home";
			}
			System.out.println("My activity is "+activity);
	
			}
}


