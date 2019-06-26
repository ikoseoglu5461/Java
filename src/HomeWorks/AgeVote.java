package HomeWorks;

import java.util.Scanner;

public class AgeVote {

public static void main(String[] args) {
	  
	int age;
	  Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();
	  
	  if (18<age) {
	    System.out.println("You are eligible to vote");
	  
	  }else if (18>age) {	    
	    System.out.println("You are not eligible to vote");
	  }else if (age==18){
		  System.out.println("You are eligible to vote");
	  }
	  }

}
