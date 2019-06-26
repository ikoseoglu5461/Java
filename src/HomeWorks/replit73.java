package HomeWorks;

import java.util.Scanner;

public class replit73 {

	
	public static void main (String [] args){

	  String ends;
	  Scanner scan= new Scanner (System.in);
	  System.out.println("In:");
	  String word=scan.nextLine();
	  
	  int z=word.length();
	  String newString=word.substring(z);
			System.out.println(newString);
			
			System.out.println("The first 3 letters of "+ word+" is " + word.substring(0, 3) );
	  
	}
	}

