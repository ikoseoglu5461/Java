package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
	
	/*
	 * How can you remove all duplicates from ArrayList?
	 */
	public static void main(String[] args) {
		List<String> aList=new ArrayList<String>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        
        
        Set<String> aList2 = new LinkedHashSet<>(aList);
        System.out.println(aList2);
	}

}
