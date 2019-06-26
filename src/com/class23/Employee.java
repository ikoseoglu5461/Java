package com.class23;

public class Employee {

	int salary;
	public static String department="IT";
	protected int salary1; // is protected

	public void getPaid() {
		System.out.println("Employee get's paid " + salary);
	}
	public static void work() {
		System.out.println("Employee works in "+department+"deparment");
	}
	protected void test() {
		System.out.println("I am a protected method");
	}
	void test1() {
		System.out.println("I am a default method");

}
}
