package com.class24;

public class TestsParent {
	public static void main(String[] args) {
		
		String a;
		a="100";
		
		double d=12;
		
		Parent prt=new Parent();
		prt.love();
		prt.work();
		
		Child cld=new Child();
		cld.love();
		cld.cry();
		cld.work();
		// type casting
		//Child obj1=new Parent(); not possible
		//achieving run time polymorphism
		
		Parent obj=new Child();
		obj.work(); //Parent work
		obj.love(); //Child love
		//obj.cry(); not possible
	}
	
}
