package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*Create a grocery list: fruits {}
		 * 						veggies {}
		 * 						dairy {}
		 * Retrieve all values using 2 different loops 
		 */
		
		String [] [] grocery= {
							{"Apple", "Banana", "Orange", "Kiwi", "Peach"},
							{"Brokoli", "Tomoto", "Patato", "Carrot", "Onion"},
							{"Milk", "Juice", "Butter", "Bread", "Bagel"}};
		
		for (int i = 0; i < grocery.length; i++) {
			for (int j = 0; j < grocery[i].length; j++) {

				System.out.print(grocery[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------For each Loop---------------");
		
		for (String[] singleGrocery : grocery) {

			for (String item : singleGrocery) {  

				System.out.print(item + " ");
			}
			System.out.println();
	}
	} 

}
