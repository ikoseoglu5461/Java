package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		
		String str="Good morning, students!";
		boolean contaions=str.contains("students");
		System.out.println(contaions);
		System.out.println("------------------------------");
		
		String present="Welcome, Mehmet";
		String needValue="WELCOME";
		
		boolean flag=present.contains(needValue);
		System.out.println(flag);
		System.out.println("------------------------------");
		
		boolean flag1=present.toLowerCase().contains(needValue);
		System.out.println(flag1);
		System.out.println("------------------------------");
		
		// 
		System.out.println("_____StartWith & EndWith____");
		String str1="syntax";
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		boolean ends=str1.endsWith("x");
		System.out.println(ends);
		
		//isEmpty() if length of a string is=0 ---->string is empty else-> is is true
		System.out.println("_____isEmpty()____");
		String str2="";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		//
		System.out.println("_____concat____");
		String str3="Hello ";
		String str4="Ali!";
		
		System.out.println(str3+str4);
		System.out.println(str3.concat (str4));
		
		//
		System.out.println("_____--_____");
		String expected="You may qualify for a multi-policy discount";
		String actual="You may qualify for a multi-policy discount";
		
		//
		actual=actual.trim();
		System.out.println(expected.contentEquals(actual));
				
		
	}
	

}
