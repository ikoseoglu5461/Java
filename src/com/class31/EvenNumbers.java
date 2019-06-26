package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {

	public static void main(String[] args) {
		/*Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.
		 * 
		 */
		
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i=1; i<=50; i++) {
			 if (i % 2 !=1) {
	                numbers.add(i);
	            }
		}
		System.out.println(numbers);
		
		Iterator<Integer> evenNumber=numbers.iterator();
		
		while(evenNumber.hasNext()) {
			if (evenNumber.next()%5==0) {
                evenNumber.remove();
            }
        }
        System.out.println(numbers);
            
		}
		
	}
