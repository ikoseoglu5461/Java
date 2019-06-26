package com.class36;

public class StringBufferDemo {

	public static void main(String[] args) {

//		StringBuffer sb=new StringBuffer("Hello");
//		
//		sb.deleteCharAt(3);
//		
//		System.out.println(sb);
		
		String str="Good Morning";
		str.concat("John");//new String(" Good Morning John")
		
		System.out.println(str);
		
		System.out.println("------------------------");
		StringBuffer sb=new StringBuffer ("Good Morning "); 
		sb.append("John");
		
		System.out.println(sb);
	}

}
