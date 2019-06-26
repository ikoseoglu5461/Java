
package HomeWorks;

import java.util.Scanner;

public class hm64 {

	public static void main(String[] args) {
		
		
		int month;
		String season;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your birthday month number");
		month=scan.nextInt();

		if (month==1 || month==2 || month==12 ) {
		  System.out.println("You were born in Winter");
		  
		  }else if (month==3 || month==4 || month==5) {
		    System.out.println("You were born in Spring");
		  
		  }else if (month==6 || month==7 || month==8) {
		    System.out.println("You were born in Summer");
		  
		  }else if (month==9 || month==10 || month==11) {
		    System.out.println("You were born in Fall");
		    }
		  else {
			System.out.println("Please enter valid month number");
		    System.out.println("Unknown");
		  }
		}

	}


