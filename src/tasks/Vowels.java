package tasks;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		
	      String phrase;
	      int length,vowels=0;
	      Scanner scan;
	      
	      System.out.print("Enter a word or phrase: ");
	      scan=new  Scanner(System.in);
	      phrase=scan.nextLine();
	      length=phrase.length();
	      for(int i=0; i<length; i++)
	      {
	       if(phrase.substring(i,i+1).compareToIgnoreCase("a")==0)
	        vowels++;
	       else if(phrase.substring(i,i+1).compareToIgnoreCase("e")==0)
	        vowels++;
	       else if(phrase.substring(i,i+1).compareToIgnoreCase("i")==0)
	        vowels++;
	       else if(phrase.substring(i,i+1).compareToIgnoreCase("o")==0)
	        vowels++;
	       else if(phrase.substring(i,i+1).compareToIgnoreCase("u")==0)
	        vowels++;
	      }
	      System.out.println(vowels);
	    }
		
		

}
