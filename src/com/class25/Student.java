package com.class25;

public class Student {
	 
	public void study() {
		System.out.println("Student must study");
	}
	protected void doHomeWork() {
		System.out.println("Student must do homework");
	}
	void attendClasses (String str, int num) {
		System.out.println("Student must attend classes");
	}
	//PRIVATE METHOD CANNOT BE OVERRIDING
	private void doReserch () {
		System.out.println("Student must do reserch");
	}
}
