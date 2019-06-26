package HomeWorks;

import java.util.Scanner;

public class replit58 {

	public static void main(String[] args) {
		
		
		 Scanner input = new Scanner (System.in);
		 System.out.println("Please enter 5 int numbers:"); 
		 int [] num = new int [5];
		          
		          for (int i = 0; i<num.length; i++) {
		        
		          num[i]= input.nextInt();
		            
		          }
		          
		          for (int  b= 0; b<num.length; b++) {
		              System.out.println(num [b]*10);
		                  
		              }

		    
		        
		        
		    }
	}


