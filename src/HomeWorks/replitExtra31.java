package HomeWorks;

import java.util.Scanner;

public class replitExtra31 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    
			String newString= s.toLowerCase();
			String lastString=newString.toUpperCase();
			
	    for (int i=0; i<=newString.length()-1; i+=1) 
	  
	      System.out.print(lastString.substring(i,i+1));
	    }

}
