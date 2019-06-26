package HomeWorks;

import java.util.Scanner;

public class replit59 {

	public static void main(String[] args) {
		
		 
		  Scanner scan=new Scanner (System.in);
		  int[] numbers=new int [5];
		   
		  for (int i=0; i<numbers.length; i++){
		  numbers[i]=scan.nextInt();}
		  
		  for (int j=(numbers.length-1); j>=0; j--){
		    System.out.println(numbers[j]);
		  }
		 
		}
	}
	