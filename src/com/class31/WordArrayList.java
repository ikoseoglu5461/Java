package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class WordArrayList {

	public static void main(String[] args) {
		/*
		 * Create an arrayList of words. Remove every word that ends with “e”.Use iterator
		 * 
		 */
	
		
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("Eenterence");
		arraylist.add("Elitte");
		arraylist.add("Envirement");
		
		
		Iterator<String> litter = arraylist.iterator();
       
		while (litter.hasNext()) {
            String word = litter.next();
            if (word.endsWith("e")) {
                litter.remove();
            }
        }
        System.out.println(arraylist);
    }

}