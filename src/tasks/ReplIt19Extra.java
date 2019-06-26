package tasks;

import java.util.Scanner;

public class ReplIt19Extra {

	public static void main(String[] args) {
		
		

		
		  
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    int end = inp.nextInt();
		    //write your code below
		    
		    for (int i=1; i<=end; i++) {
		      if (end>0) {
		      System.out.print(i+" ");
		      }else {
		      System.out.print(" ");
		     }
		    }
		    }
}