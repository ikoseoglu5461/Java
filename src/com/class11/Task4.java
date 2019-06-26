package com.class11;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		 * Miss and Smith, Jordan, Jackson, Obama. After storing values print the
		 * following: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 * 
		 */

		String[][] names = {
				// 0 ......1..... 2...... 3
				{ "Mr.", "Mrs.", "Ms.", "Miss." }, //0
				// 0.........1......... 2......... 3
				{ "Smith", "Jordan", "Jackson", "Obama" }};  //1 
		
		System.out.println(names[0][1]+" "+names[1][0]); // Mrs Smith
		System.out.println(names[0][0]+" "+names[1][3]); // Mr Obama
		System.out.println(names[0][2]+" "+names[1][2]); // Ms Jackson
		System.out.println(names[0][3]+" "+names[1][1]); // Miss Jordan
	}
}
