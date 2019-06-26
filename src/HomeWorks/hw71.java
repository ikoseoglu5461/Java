package HomeWorks;
import java.util.Scanner; 
public class hw71 {

	public static void main(String[] args) {
		
		
		 
		  
		  String name;
		  String assigment;
		  
		  Scanner scan = new Scanner (System.in);
		  System.out.println("enter name of the instructor");
		  name=scan.nextLine();
		  
		 switch (name) {
				case "Shiva" : 
					assigment="Will take care of Java Assignment";
					break;
				case "Sandish":
					assigment="Will take care of SDLC Assignment";
					break;
				case "Weqas":
					assigment="Will take care of Selenium Assignment";
					break;	
				case "Asel":
					assigment="Will take care of every Assignment";
					break;
				default:
					assigment = "Invalid instructor selected";}
		 System.out.println(assigment);
					
		 }
		}
		

	
