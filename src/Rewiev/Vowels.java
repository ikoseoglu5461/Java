package Rewiev;

public class Vowels {
	
	public static void main (String [] args) {
		
		Vowels ismail=new Vowels();
		
		ismail.vowelsCountWithLoop();}
	
	void vowelsCountWithLoop() {
		String ismail="Hello world my name ISmail";
		
		
		
		char [] w=ismail.toCharArray();
		
		for (int i=0; i<w.length; i++) {
			
			if (w[i]=='a' || w[i]=='A'|| w[i]=='e' || w[i]=='E' || w[i]=='i' || w[i]=='I' || w[i]=='o' || w[i]=='O' || w[i]=='u' || w[i]=='U') {
				
				char empty=w[i];
				System.out.print(empty+ ",");
		}
	}

	}}
