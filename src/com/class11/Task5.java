package com.class11;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array that first row will contain 4 names and second row will contain grades. 
		 * Then you program should print name of the students that has as an A and B grade
		 */
		
		String [] [] names= {
				//0.......1........2.........3
				{"Ali", "Veli", "Mehmet", "Huseyin"}, //0
				//0...1
				{"A","B"}};                           //1
		
		
		System.out.println(names[0][0]+" has "+names[1][1]+" garde.");
		System.out.println(names[0][1]+" has "+names[1][1]+" garde.");
		System.out.println(names[0][2]+" has "+names[1][0]+" garde.");
		System.out.println(names[0][3]+" has "+names[1][0]+" garde.");
	}

}
