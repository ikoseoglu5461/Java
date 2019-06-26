package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {
	
	public static void main(String[] args) {
		//generic Array that stores only String Object
		ArrayList<String> names=new ArrayList <String>();
		
		names.add("Ali");
		names.add("Veli");
		names.add("Ismail");
		names.add("Asim");
		names.add("Fatih");
		//names.add(123); not valid since we have generic arrayList of a type of String
		
		ArrayList alist=new ArrayList();
		alist.add("String");
		alist.add(100);
		alist.add(100.10);
		alist.add(true);
		alist.add('a');
		
		for (Object value:alist) {
			System.out.println(value);
		}
		ArrayList<Boolean> boleanArrayList=new ArrayList();
		boleanArrayList.add(true);
		boleanArrayList.add(false);
		
		for(Object val:boleanArrayList) {
			System.out.println(val);
		}
		
		
	}

}
