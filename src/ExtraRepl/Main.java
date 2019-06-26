package ExtraRepl;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Main {
	public static void main(String[] args) {
		
		/*
		 * Write program  to iterate the values (use Iterator) through HashSet

			Add the values as
			first
			second
			third
			fourth 
			fifth 


			Output:
			first
			second
			third
			fourth
			fifth
			Does HashSet contains first element? true
		 */

		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("fifth");

		for (String word : hs)
			System.out.println(word);
		System.out.println("Does HashSet contains first element? " + hs.contains("first"));

	}
}
