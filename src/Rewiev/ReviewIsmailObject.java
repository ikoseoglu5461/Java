package Rewiev;

import java.util.Scanner;

public class ReviewIsmailObject {
	
	String eyes, nose, hair, shirt;
	
	public static void main (String [] args) {
	
	ReviewIsmailObject ismail=new ReviewIsmailObject();
	
//	ismail.eyes="Hazel";
//	ismail.hair="Brown";
//	ismail.nose="Blue";
//	ismail.shirt="Red";
//	ismail.humanEyes();
//	
//	System.out.println(ismail.humanEyes());
	
//	ReviewIsmailObject ismail1=new ReviewIsmailObject();
//	
//	ismail1.eyes="Green";
//	
//	System.out.println(ismail1.eyes);
	
	ismail.scannerFirstName();
	ismail.noReturn();
	ismail.scannerInt();
	}	
	void humanEyes() {
	ReviewIsmailObject ismail1=new ReviewIsmailObject();	
	ismail1.eyes="Red";
	System.out.println(ismail1.eyes);
	}
	void noReturn () {
		System.out.println("I do not have a return type");
	}
	void scannerFirstName() {
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
	}
	void scannerInt() {
		Scanner scan=new Scanner(System.in);
		scan.nextInt();
	}
}
