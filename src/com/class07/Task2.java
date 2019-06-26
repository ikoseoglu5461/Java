package com.class07;

public class Task2 {

	public static void main(String[] args) {
		/* create boolean variable workDay and assign true 
		 * create int variable day and assign it to 1 
		 * as long asv it is workDay print "I need a day off" and increasement day
		 * day once day is 6--> your condition for your loop  should become false
		 * 
		 */
		
		boolean workDay=true;
		
			int day=1;
			
			while (workDay) {
		
				System.out.println("I need a day off");
				 
			if (day==6)	{
				System.out.println("I don't need a day off");
				workDay=false;
				}
			day++;
			
			}
		}

}
