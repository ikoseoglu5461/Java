package HomeWorks;
import java.util.Scanner;
public class replitExtra18 {
	

	
	  public static void main(String[] args) {
	  	Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String word = inp.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	
	 
	  
	  
	  	if (word.contains("y")){
	  	  System.out.println("-ies");
	  
	  	}else if (word.endsWith("y") && word.contains("ey")) {
	  	  System.out.println("-eys");
	  	
	  	  
	  	}else if (word.contains("ife")){
	  	  System.out.println("-ives");
	  	}else {
	  	  System.out.println("-s");
	  	}
	  }
	}


